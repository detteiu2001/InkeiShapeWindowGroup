# InkeiShapeWindowGroup
起動すると正方形のウィンドウ2つとその間にそびえ立つ一本の細長いウィンドウを枠無しで生成するただそれだけのソフトです。当たり前ですがこんなクソソフトのためにパッケージ化なんてしてませんので直接Main.classを叩けばいいと思います。

## このソフトはパブリックドメインですがこんなもんをcloneすべきではないと思います。

### 使用方法
1. コンソールか何かで`java Main`と叩きます
2. `size ?`と聞かれますのでサイズを指定します
3. `xpos ?`と聞かれますのでSaoの左上座標を指定します。同じ要領でyposも指定します
4. **そこには消せないクソみたいなウィンドウが！！！**
5. 当然消し方なんてないのでctrl+cするなりターミナルごと殺すなりして消してください

#### 注意
 * xposの値がサイズを下回ると画面外にはみ出します
 * yposの値とsizeの値によっては画面外にはみ出します

### 引数
わざわざサイズ指定するのもめんどいので、引数で指定もできます。
 | 引数の数 | それぞれの意味    | 備考
 |:-------:|:-----------------|:-------------------------------
 |    1    | size             | xpos、yposはそれぞれ200になります
 |    3    | size, xpos, ypos | なし
