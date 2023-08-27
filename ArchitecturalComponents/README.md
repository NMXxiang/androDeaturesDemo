# ArchitecturalComponents:架构组件

- Interfacelayer: _通过视图绑定的方式绑定按钮,点击弹出提示_
---
使用视图绑定时要确定build.gradle(Module:app)中有将enabled设置为true
```
android {
    ...
    viewBinding {
        enabled = true
    }
}

```