//package pl.infoshare.final_test;
//
//import javafx.scene.layout.Pane;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipOutputStream;
//
//public class Akcja extends AbstractAction {
//
//    private JList lista;
//
//    public Akcja(String nazwa, String opis, String klawiaturowySkrot) {
//        this.putValue(Action.NAME, nazwa);
//        this.putValue(Action.SHORT_DESCRIPTION, opis);
//        this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(klawiaturowySkrot));
//    }
//    public Akcja(JList lista, String nazwa, String opis, String klawiaturowySkrot) {
//        this.lista = lista;
//        this.putValue(Action.NAME, nazwa);
//        this.putValue(Action.SHORT_DESCRIPTION, opis);
//        this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(klawiaturowySkrot));
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getActionCommand().equals("Add"))
//            dodajWpisyDoArchiwum();
//        else if(e.getActionCommand().equals("Erase"))
//            usuwanieWpisowZListy();
//        else if(e.getActionCommand().equals("ZIP"))
//            stworzArchiwumZip();
//    }
//
//    private void dodajWpisyDoArchiwum() {
//        wybieracz.setCurrentDirectory(new File(System.getProperty("user.dir")));
//        wybieracz.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//        wybieracz.setMultiSelectionEnabled(true);
//        int tmp = wybieracz.showDialog(null, "Dodaj do archiwum");
//
//        if (tmp == JFileChooser.APPROVE_OPTION) {
//            File[] sciezki = wybieracz.getSelectedFiles();
//
//            for (int i =0; i < sciezki.length; i++) {
//                if(!czyWpisSiePowtarza(sciezki[i].getPath()))
//                    modelListy.addElement(sciezki[i]);
//            }
//
//        }
//
//    }
//
//    private void usuwanieWpisowZListy() {
//        int[] tmp = lista.getSelectedIndices();
//
//        for (int i = 0; i < tmp.length; i++)
//            modelListy.remove(tmp[i]-i);
//
//    }
//
//    private boolean czyWpisSiePowtarza(String testowanyWpis) {
//
//        for (int i = 0; i < modelListy.getSize(); i++){
//            if (((File)modelListy.get(i)).getPath().equals(testowanyWpis)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private void stworzArchiwumZip() {
//        wybieracz.setCurrentDirectory(new File(System.getProperty("user.dir")));
//        wybieracz.setSelectedFile(new File(System.getProperty("user.dir")+File.separator+"moja nazwa.zip"));
//        int tmp = wybieracz.showDialog(null, "Kompresuj");
//
//        if(tmp == JFileChooser.APPROVE_OPTION)
//        {
//
//
//            byte tmpData[] = new byte[BUFOR];
//            try {
//                ZipOutputStream zOutS = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(wybieracz.getSelectedFile()),BUFOR));
//
//                for (int i =0; i < modelListy.getSize(); i++)
//                {
//                    if (!((File)modelListy.get(i)).isDirectory())
//                        zipuj(zOutS, (File)modelListy.get(i), tmpData, ((File)modelListy.get(i)).getPath());
//                    else {
//                        wypiszSciezki((File)modelListy.get(i));
//
//                        for(int j = 0; j < listaSciezek.size(); j++)
//                            zipuj(zOutS, (File)listaSciezek.get(j), tmpData, ((File)modelListy.get(i)).getPath());
//                        listaSciezek.removeAll(listaSciezek);
//                    }
//                }
//
//                zOutS.close();
//                //BufferedInputStream - poto aby sie buforowalo szybciej
//                //FIleInputStream - poto aby dalo sie otworzyc pliki
//            }
//            catch(IOException e) {
//                System.out.println(e.getMessage());
//            }
//
//
//
//        }
//    }
//
//
//    private void zipuj(ZipOutputStream zOutS, File sciezkaPliku, byte[] tmpData, String sciezkaBazowa) throws IOException{
//        BufferedInputStream inS = new BufferedInputStream(new FileInputStream(sciezkaPliku), BUFOR);
//
//        zOutS.putNextEntry(new ZipEntry(sciezkaPliku.getPath().substring(sciezkaBazowa.lastIndexOf(File.separator)+1)));
//
//        int counter;
//        while ((counter = inS.read(tmpData, 0, BUFOR)) != -1)
//            //te -1 oznacza ze wykonuje sie dopuki nie jest koniec strumienia("pliku")
//            zOutS.write(tmpData, 0, counter);
//
//        zOutS.closeEntry();
//        inS.close();
//    }
//
//    private void wypiszSciezki (File nazwaSciezki) {
//        String[] nazwyPlikowIKatalogow = nazwaSciezki.list();
//        System.out.println(nazwaSciezki.getPath());
//        for (int i = 0;i < nazwyPlikowIKatalogow.length; i++) {
//
//            File p = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i]);
//            //System.out.println(p.getName());
//
//
//
//            if (p.isFile())
//                listaSciezek.add(p);
//            //wypisze tylko same pliki /\/\
//            if (p.isDirectory())
//                wypiszSciezki(new File(p.getPath()));
//            //przeszuka wszystkie foldery
//        }
//    }
//
//    private JFileChooser wybieracz = new JFileChooser();
//    ArrayList listaSciezek = new ArrayList();
//    public static final int BUFOR = 1024;
//
//    private DefaultListModel modelListy = new DefaultListModel(){
//        @Override
//        public void addElement(Object obj) {
//            lista.add(obj);
//            super.addElement(((File)obj).getName());
//        }
//        @Override
//        public Object get(int index) {
//            return lista.get(index);
//        }
//
//        @Override
//        public Object remove(int index){
//            lista.remove(index);
//            return super.remove(index);
//
//        }
//
//        ArrayList lista  = new ArrayList();
//    };
//}
