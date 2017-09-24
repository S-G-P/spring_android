# spring app
AndroidのWebViewとして使用するために、Webはspring bootを採用する。
Android appのリポジトリは別に作成
https://github.com/S-G-P/android_app

環境は以下の通り
spring boot:       web application framework

MySQL:             DBはこれで

flyway:            migration tool 基本的にはいらないかなぁと思うけど一応作っとく、DDLのバージョン管理ができる

Thymeleaf:         Spring Boot で使えるテンプレートエンジン、freemarkerとかもあるけどとりあえずこれで

Gradle(Buildship): ビルドツール、もはやスタンダードでしょ。それにspringとの親和性高いし

Lombok:            @Getter, @SetterをBeanにつけるだけでGetMethod, SetMethodを書かなくてよくなる

DevTools:          Spring Boot の開発補助ツール。ファイルを変更すると自動的に更新されるようになる。


随時足していく。README.mdに書くことかなぁ。。。
