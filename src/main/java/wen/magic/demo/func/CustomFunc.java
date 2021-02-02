package wen.magic.demo.func;

import java.util.Date;
import org.springframework.stereotype.Component;
import org.ssssssss.magicapi.config.MagicFunction;
import org.ssssssss.script.annotation.Comment;
import org.ssssssss.script.annotation.Function;
import org.ssssssss.script.functions.DateExtension;

@Component
public class CustomFunc implements MagicFunction {

  @Function
  @Comment("嘿嘿，自定义的！")
  public static Date customNow() {
    return new Date();
  }

  @Function
  @Comment("日期格式化")
  public static String dateFormat(@Comment("目标日期") Date target) {
    return target == null ? null : DateExtension.format(target, "yyyy-MM-dd HH:mm:ss");
  }

  @Function
  @Comment("判断值是否为空")
  public static Object ifNull(
      @Comment("目标值") Object target,
      @Comment("为空的值") Object trueValue,
      @Comment("不为空的值") Object falseValue) {
    return target == null ? trueValue : falseValue;
  }

}
