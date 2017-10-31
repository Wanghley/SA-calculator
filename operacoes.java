package sources;
/**
 * @since 2017
 * @version 1.0
 * @author wanghley
 */
public class operacoes {
    private static int convertT,convertD,convertTa;
    private static char op;
    public static float vM,dvf,ca=3.6f,aM,convertDa;
    
    public static float Vm(float ds,float dt){
        if(convertD == 1000 && convertT == 3600){
          vM = ds/dt;            
        }else{
            if(convertD == convertT){
                vM = (ds/dt)*ca;
            }else{
                switch(op){
                    case '*':
                        vM = ((ds*convertD)/(dt*convertT))*ca;
                        break;
                    case '/':
                        vM = ((ds/convertD)/(dt*convertT))*ca;
                }
            }
        }
        return vM;
        
    }
    public static void Vmtest(String unidDist,String unidTemp){
        switch(unidDist){
            case "Km":
                convertD = 1000;
                op = '*';
                break;
            case "Hec":
                convertD = 100;
                op = '*';
                break;
            case "Decam":
                convertD = 10;
                op = '*';
                break;
            case "M":
                convertD = 1;
                op = '*';
                break;
            case "Decim":
                convertD = 10;
                op = '/';
                break;
            case "Cm":
                convertD = 100;
                op = '/';
                break;
            case "Mm":
                convertD = 1000;
                op = '/';
                break;
        }
        switch(unidTemp){
            case "Hora":
                convertT = 3600;
                break;
            case "Min":
                convertT = 60;
                break;
            case "Seg":
                convertT = 1;
                break;
        }
    }
    public static float Am(float dv,float dt){
        if(convertDa == 3.6){
            switch(convertTa){
                case 3600:
                    aM = (dv/ca)/(dt*3600);
                    break;
                case 60:
                    aM = (dv/ca)/(dt*60);
                    break;
                case 1:
                    aM = (dv/ca)/dt;
                    break;
            }
        }else if(convertDa != 3.6 && convertDa == 1){
            switch(convertTa){
                case 3600:
                    aM = dv/(dt*3600);
                    break;
                case 60:
                    aM = dv/(dt*60);
                    break;
                case 1:
                    aM = dv/dt;
                    break;
            }
        }
        return aM;
    }
    public static void Amtest(String unidVaria,String unidTemp){
         switch(unidVaria){
            case "Km/h":
                convertDa = 3.6f;
                op = '/';
                break;
            case "M/s":
                convertDa = 1.0f;
                op = '/';
                break;
        }
        switch(unidTemp){
            case "Hora":
                convertTa = 3600;
                break;
            case "Min":
                convertTa = 60;
                break;
            case "Seg":
                convertTa = 1;
                break;
        }
    }
}
