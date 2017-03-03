## api docs
### module webUser api[用户板块api]
0. code说明
    ```
        code:200  message: "请求成功"
        code:500  message："请求失败"
        code:
    ```
1. 用户注册
    ```
        method : GET/POST
        url    : http://api.codingstar.cn/webUser/register
        param  :
            username [String] 用户名 至少为8位数字或字母
            password [String] 密码   至少为8位数字或字母
            confirmPassword  [String] 确认密码    与password相同(暂时服务端未作验证)
        data   :
            {
                "code": 200,
                "message": "请求成功",
                "data": {
                    "username": "xuyanghuang",
                    "enable": true
                }
            }
        example :
                uri: http://api.codingstar.cn/webUser/register?username=xuyanghuang&password=xuyanghuang
                data:
                    {
                        "code": 200,
                        "message": "请求成功",
                        "data": {
                            "username": "xuyanghuang",
                            "enable": true
                        }
                    }
    ```
2. 用户登陆
    ```
        method : GET/POST
        url    : http://api.codingstar.cn/webUser/register
        param  :
                    username [String] 用户名 至少为8位数字或字母
                    password [String] 密码   至少为8位数字或字母
        data   :
            {
                "code": 200,
                "message": "登陆成功",
                "data": {
                    "username": "xuyanghuang",
                    "password": "xuyanghuang",
                    "token": "198a1a43ad41f3d47bd1ea7ea858086b151aab093d106513747a106aae1f34da"
                }
            }
    ```
