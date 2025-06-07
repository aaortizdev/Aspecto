import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;


@Aspect
public class SingletonAspect {

    private Configurador instanciaUnica = null;

    @Pointcut("execution(Configurador.new(..))")
    public void constructorConfigurador() {}

    @Around("constructorConfigurador()")
    public Object aplicarSingleton(ProceedingJoinPoint joinPoint) throws Throwable {
        if (instanciaUnica == null) {
            instanciaUnica = (Configurador) joinPoint.proceed();
        }
        return instanciaUnica;
    }
}
