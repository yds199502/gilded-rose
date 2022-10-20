package com.gildedrose.analysis;

import com.gildedrose.Item;
import com.gildedrose.factory.QualityAnalysis;

public class BackstagePassesAnalysis extends QualityAnalysis {
    @Override
    public void updateQuality(Item item) {
        int oldSellIn = item.sellIn;

        item.sellIn = item.sellIn-1;

        if(item.quality == 0){
            return;
        }

        if(item.quality < 50){
            if(oldSellIn > 10){
                item.quality = item.quality + 1;
            }
            if(oldSellIn >5 && oldSellIn <= 10){
                if(item.quality + 2 > 50 ){
                    item.quality = 50;
                }else{
                    item.quality = item.quality + 2;
                }
            }
            if(oldSellIn > 0 && oldSellIn <= 5){
                if(item.quality + 3 > 50 ){
                    item.quality = 50;
                }else{
                    item.quality = item.quality + 3;
                }
            }
            if(oldSellIn ==0){
                item.quality = 0;
            }
        }

    }
}
