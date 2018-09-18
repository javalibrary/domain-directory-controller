package com.imperva.opensource.ddc.core.language.searchcriteria;

import com.imperva.opensource.ddc.core.query.DirectoryType;
import org.apache.commons.lang.NotImplementedException;


/**
 * Created by gabi.beyo on 23/06/2015.
 */
public class SearchCriteriaFactory {

    public static SearchCriteriaBuilder create(DirectoryType directoryType){
        SearchCriteriaBuilder searchCriteriaBuilder;
        switch (directoryType) {
            case MS_ACTIVE_DIRECTORY:
                searchCriteriaBuilder = new ActiveDirectorySearchCriteriaBuilderImpl();
                break;
            default:
                throw new NotImplementedException();
        }
        return searchCriteriaBuilder;
    }
}
