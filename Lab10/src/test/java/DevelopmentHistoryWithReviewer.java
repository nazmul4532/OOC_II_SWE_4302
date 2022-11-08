import java.lang.annotation.*;


@Target({ElementType.TYPE,ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface DevelopmentHistoryWithReviewer{
    DevelopmentHistory developmentHistory();
    String[] reviewers() default {};
}
