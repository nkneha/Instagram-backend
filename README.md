
# Instagram Backend

## Language and Framwork 

```bash
 Java , SpringBoot , JPA , MYSQL database , Swagger UI
```

## Data Flow

 1. Controller 

```bash
 #Apis for Post (PostController)
  getPostById()
  createPost()

#Apis for User (UserController)
  signUpUser()
  signInUser()
  signOutUser()
```
2. Service 

```bash
 #Servicefor Post 
  getPostById()
  createPost()

#Service for User 
  signUpUser()
  signInUser()
  signOutUser()

#Service for authenticationService
  authenticate()
  saveAuthToken()
  findFirstByUser()
  removeToken()

#Service for utility
  EmailUtility()
  HashingUtility()
```

3. Model

```bash
 Post()
 User()
 AuthenticationToken()
 SignUpOutput()
 SignInInput()
```
4. Repository

```bash
 IAuthTokenRepo()
 IPostRepo()
 IOrderRepo()
```

## Data Structure Used

```bash
 MYSQL as database
```

## Project Summary

Instagram Backend is a Assignment to practice mapping , APis and SignIn and SignUP createPost and get post by id in springboot.
 
  #### Features for Employee

- Create /SignUp user
- SignIn user(Send token on mail for verification)
- SignOut user (Delete token)
- Create Post (Create the Post using email and token and post link)
- Get post by id(get the specific post by providin email, token and post id)

  
