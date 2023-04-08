/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lucas.teste.looca;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import java.util.List;
import oshi.software.os.OSProcess;

/**
 *
 * @author lucka
 */
public class TesteLooca {

    public static void main(String[] args) {

        Looca looca = new Looca();

        Sistema sistema = looca.getSistema();
        Processador processador = looca.getProcessador();
        Temperatura temperatura = looca.getTemperatura();

//        DiscoGrupo grupoDeDisco = looca.getGrupoDeDiscos();
//        List<Disco> discos = grupoDeDisco.getDiscos();
//        
//        for(Disco disco: discos){
//            System.out.println(disco);
//        }
        ProcessoGrupo grupoDeProcessos = looca.getGrupoDeProcessos();
        List<Processo> processos = grupoDeProcessos.getProcessos();
        
//        OSProcess  processoNome = (OSProcess) processos.get(0);

        
        
        Integer processos2 = grupoDeProcessos.getTotalProcessos();
        
//        System.out.println(processoNome);

        for (Processo processo : processos) {
            System.out.println(processo);
//            System.out.println(String.format("Processo: PID: %d\n"
//                    + "Nome: %s\n"
//                    + "Uso de memória: %.2f\n",processo.getPid(), processo.getNome(), processo.getUsoMemoria()));
        }

        System.out.println(processos2);
    }

}
