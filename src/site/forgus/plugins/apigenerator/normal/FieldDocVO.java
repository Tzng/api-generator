package site.forgus.plugins.apigenerator.normal;

import java.io.Serializable;

/**
 * 文档渲染对象
 */
public class FieldDocVO implements Serializable {

    private static final long serialVersionUID = -8613143786365545336L;

    private String name;
    private String type;
    private String require;
    private String range;
    private String desc;

    private FieldDocVO(String name, String type, String require, String range, String desc) {
        this.name = name;
        this.type = type;
        this.range = range;
        this.desc = desc;
        this.require = require;
    }

    public static FieldDocVO normal(String name, String type,String require, String range, String desc) {
        return new FieldDocVO(name,type,require,range,desc);
    }

    public static FieldDocVO parent(String name, String type,String require, String range, String desc) {
        return new FieldDocVO("**"+name+"**",type,require,range,desc);
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRange() {
        return range;
    }

    public String getDesc() {
        return desc;
    }
}