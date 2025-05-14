import java.util.Locale;

public class ArgsLinhaDeComandoMath {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        if (args.length == 0) {
            System.err.println("Precisa de Argumentos");
            System.exit(0);
        }
        String resp = "ERROR";
        args[0] = args[0].toLowerCase();
        try {
            switch (args[0]) {
                case "--help":
                    resp = "Programa: Cmd Math via args\n" +
                           "Funções:\n\tsqrt x\n\tpow x y\n\tlog10 x\n" +
                           "Constantes:\n\tPI\n\tE\n\tPHI\n";
                    break;
                case "--author":
                    resp = "Autor: Jesimar da Silva Arantes";
                    break;
                case "--version":
                    resp = "Versão: 1.0";
                    break;
                case "sqrt":
                    if (args.length >= 2) {
                        resp = String.format(locale, "%.4f",
                            Math.sqrt(Double.parseDouble(args[1])));
                    } else {
                        resp = "Uso: sqrt <número>";
                    }
                    break;
                case "pow":
                    if (args.length >= 3) {
                        double x = Double.parseDouble(args[1]);
                        double y = Double.parseDouble(args[2]);
                        resp = String.format(locale, "%.4f", Math.pow(x, y));
                    } else {
                        resp = "Uso: pow <base> <expoente>";
                    }
                    break;
                case "log10":
                    if (args.length >= 2) {
                        resp = String.format(locale, "%.4f",
                            Math.log10(Double.parseDouble(args[1])));
                    } else {
                        resp = "Uso: log10 <número>";
                    }
                    break;
                case "pi":
                    resp = String.format(locale, "%.10f", Math.PI);
                    break;
                case "e":
                    resp = String.format(locale, "%.10f", Math.E);
                    break;
                case "phi":
                    resp = String.format(locale, "%.10f", 1.618033988749895);
                    break;
                default:
                    resp = "Comando não reconhecido. Use --help para opções.";
            }
        } catch (NumberFormatException e) {
            resp = "Erro: argumento inválido. Esperado número.";
        }
        System.out.println(resp);
    }
}
