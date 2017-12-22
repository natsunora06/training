class UsersController < ApplicationController
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
        image_name:"default_user.jpg"
    )
    #gender: params[:gender])
    #　登録成功かどうかの条件分岐
    if @user.save
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
    #@user.gender = params[:gender]

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
end
