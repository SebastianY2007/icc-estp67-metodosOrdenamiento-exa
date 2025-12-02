package controllers;

import models.*;

public class BrandController {

    public Brand[] sortSelectionDesc(Brand[] brands) {
        int n = brands.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (brands[j].getTotalValidYears() > brands[maxIndex].getTotalValidYears()) {
                    maxIndex = j;
                }
            }

          
            Brand aux = brands[i];
            brands[i] = brands[maxIndex];
            brands[maxIndex] = aux;
        }

        return brands;
    }

    public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {

        int left = 0;
        int right = brands.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            int midValue = brands[mid].getTotalValidYears();

            if (midValue == validYears) {
                return brands[mid];
            }

            if (isAscending) {
                if (validYears < midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (validYears > midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return null;
    }
}

