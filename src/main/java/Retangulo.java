import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Retangulo {
    private double base;
    private double altura;


 /*   public double RetanguloArea(double base, double altura){
        return base*altura;
    }*/

    public double RetanguloPerimetro(double base, double altura){
        return (base+altura)*2;
    }
}
