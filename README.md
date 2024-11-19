# MendingSettingTools
控制经验修补效果的插件。  

## 介绍
该插件适用于Spigot1.12及以上。  

控制经验修补效果。
## 指令
`/mendingsettingtools` 重载配置。  
**缩写：`/mstool`**

## 配置文件
插件成功启动后，会在plugins文件夹下生成配置文件，位于 `plugins/mendingsettingtools/config.yml`  

其中包含各个事件，若对应事件的值为**true**，则会被**阻止发生**。

```yaml
# 触发效果时的提示
tip:
  # 是否启用提示（true为启用，false为禁用）
  enable: true
  # 提示内容
  tips:
    - "&b经验修补的效果被修改。"
    - "&b经验修补的效果被修改。"
# 每次触发效果时，修补的耐久数（必须为正整数或零）
setRepairAmount: 0
```

## 权限节点
`mendingsettingtools.main` 使用重载指令。

## 使用方法
1. 将插件放入plugins文件夹中，重启服务器。
