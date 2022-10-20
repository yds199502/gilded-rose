package com.gildedrose.analysis;

import com.gildedrose.Item;
import com.gildedrose.factory.QualityAnalysis;

public class AgedBrieAnalysis extends QualityAnalysis {

    @Override
    public void updateQuality(Item item) {
        item.sellIn = item.sellIn-1;

        if(item.quality == 0){
            return;
        }

        if(item.quality < 50){
            item.quality = item.quality+1;
        }


    }
}
