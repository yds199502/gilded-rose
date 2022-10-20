package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.analysis.*;

public class QualityAnalysisFactory {

    public void updateQuality(Item item) {
        QualityAnalysis analysis = getAnalysis(item.name);
        if(analysis == null){
            System.out.println("Unable to parse the changed item");
            return;
        }
        analysis.updateQuality(item);
    }
    /**
     * 根据 name 来获取解析器
     *
     * @param name 处理对象的名称
     * @return 解析器
     */
    private QualityAnalysis getAnalysis(String name) {

        if(name == null || "".equals(name)){
            return null;
        }

        switch (name){
            case "Aged Brie":
                return new AgedBrieAnalysis();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasAnalysis();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassesAnalysis();
            case "Conjured Mana Cake":
                return new ConjuredAnalysis();
            default:
                return new DefaultAnalysis();
        }
    }
}
