package name.guyue.backend.enums;

/**
 * 房源状态
 * @author hujia
 * @date 2019-03-25
 */
public enum HouseStateTypeEnum {
    /** 待审核 */
    NotVerify,
    /** 审核通过 */
    Verified,
    /** 审核未通过 */
    Pass,
    /** 已失效 */
    Disabled,
    /** 正常房源 */
    Normal,
}
