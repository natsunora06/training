class UsersController < ApplicationController
  before_action :authenticate_user, {only: [:index, :show, :edit, :update]}
  before_action :forbid_login_user, {only: [:new, :create, :login_form, :login]}
  before_action :ensure_correct_user,{only: [:edit, :update]}

  #enum gender: {male:1, female:2}

  #　ユーザー一覧
  def index
    @users = User.all
  end

  #　ユーザー詳細
  def show
    @user = User.find_by(id: params[:id])
  end

  # 新規登録ページ
  def new
    @user = User.new

  end

  #　ユーザー登録時のアクション
  def create

    @user = User.new(
        name: params[:name],
        email: params[:email],
        image_name:"default_user.jpg",
        password: params[:password]
        #gender: [:male, :female]
    )

    if params[:gender].present?
      @users = @users.get_by_gender params[:gender]
    end

    #　登録成功かどうかの条件分岐
    if @user.save
      session[:user_id] = @user.id
      flash[:notice] = "ユーザー登録が完了しました"
      redirect_to("/users/#{@user.id}")
    else
      render("users/new")
    end

  end

  # ユーザー登録編集
  def edit
    @user =User.find_by(id: params[:id])
  end

  def update
    @user =User.find_by(id: params[:id])
    @user.name = params[:name]
    @user.email = params[:email]
    @user.gender = params[:gender]
     # @user.gender = "#{@user.id}"
     # gender = params[:gender]


    #end

    if params[:image]
      @user.image_name = "#{@user.id}.jpg"
      image = params[:image]
      File.binwrite("public/user_images/#{@user.image_name}" ,image.read)
    end

    if @user.save
      flash[:notice] = "ユーザー情報を編集しました"
      redirect_to("/users/#{@user.id}")
    else
      render("users/edit")
    end

  end

  def login_form
  end

  def login
    # ログインするユーザーを特定する
    @user = User.find_by(email: params[:email], password: params[:password])
    # ユーザーが存在するか、しないか
    if @user
      session[:user_id] = @user.id
      flash[:notice] = "ログインしました"
      redirect_to("/posts/index")
    else
      @error_massage = "メールアドレスまたはパスワードが間違っています"
      render("users/login_form")

      @email = params[:email]
      @password = params[:password]
    end
  end

  def logout
    session[:user_id] = nil
    flash[:notice] = "ログアウトしました"
    redirect_to("/login")
  end

  def likes
    @user = User.find_by(id: params[:id])
    @likes = Like.where(user_id: @user.id)
  end


  def ensure_correct_user
    if @current_user.id != params[:id].to_i
      flash[:notice] = "権限がありません"
      redirect_to("/posts/index")
    end

  end

end
