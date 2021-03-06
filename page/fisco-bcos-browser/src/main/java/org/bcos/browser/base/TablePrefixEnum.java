/*
 * This file is part of FISCO BCOS Browser.
 *
 * FISCO BCOS Browser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FISCO BCOS Browser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FISCO BCOS Browser.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * @file: TablePrefixEnum.java
 * @author: v_wbsqwu
 * @date: 2018
 */

package org.bcos.browser.base;

public enum TablePrefixEnum {
    TB_STAT_TRANSACTION("tb_stat_transaction_"),//"tb_stat_transaction_" prefix of the series table
    TB_SINGLE_STAT("tb_single_stat_"),//"tb_single_stat_" prefix of the series table
    TB_STAT_BLOCK("tb_stat_block_");//"tb_stat_block_" prefix of the series table


    private String value;
    TablePrefixEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
