# 简介

展示管理 Gradle 依赖的几种不同方式

1. 使用 rootProject.ext {} 定义各依赖库

2. 在 buildSrc 模块中定义各依赖库

3. 声明定义各依赖库的独立 Gradle 插件项目，利用 composite build 将此插件与主工程项目一同构建

# 目录说明

build-src-project：buildSrc 方式的演示

version-plugin：声明定义各依赖库的独立 Gradle 插件项目

composite-build-project：composite build 方式的演示
