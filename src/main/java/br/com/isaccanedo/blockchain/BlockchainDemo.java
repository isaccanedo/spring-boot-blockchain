package br.com.isaccanedo.blockchain;

public class BlockchainDemo {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        blockchain.addBlock(new String[]{"Isac envia 500 bitcoin para Carlos.", "Ricardo envia 100 bitcoin para Isac."});
        blockchain.addBlock(new String[]{"Vanessa envia 200 bitcoin para Karina."});
        blockchain.addBlock(new String[]{"Santana envia 40 bitcoin para Pedro."});

        System.out.println("Hash de blocos:");
        for(Block block : blockchain.getBlocks()) {
            System.out.println("Bloco #" + block.getIndex()  + ": " + block.getHash());
        }
    }
}
