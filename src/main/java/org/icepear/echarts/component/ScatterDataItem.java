package org.icepear.echarts.component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.scatter.ScatterDataItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain=true)
@Data
public class ScatterDataItem implements ScatterDataItemOption {

	private String symbol;

	@Setter(AccessLevel.NONE)
	private Object symbolSize;

	public ScatterDataItem setSymbolSize(Number symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	public ScatterDataItem setSymbolSize(Number[] symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	private Number symbolRotate;

	private Boolean symbolKeepAspect;

	@Setter(AccessLevel.NONE)
	private Object symbolOffset;

	public ScatterDataItem setSymbolOffset(Number symbolOffset) {
		this.symbolOffset = symbolOffset;
		return this;
	}

	public ScatterDataItem setSymbolOffset(Number[] symbolOffset) {
		this.symbolOffset = symbolOffset;
		return this;
	}

	public ScatterDataItem setSymbolOffset(String symbolOffset) {
		this.symbolOffset = symbolOffset;
		return this;
	}

	public ScatterDataItem setSymbolOffset(String[] symbolOffset) {
		this.symbolOffset = symbolOffset;
		return this;
	}

	private ItemStyleOption itemStyle;

	private SeriesLabelOption label;

	private Object emphasis;

	private Object select;

	private Object blur;

	@Setter(AccessLevel.NONE)
	private Object id;

	public ScatterDataItem setId(Number id) {
		this.id = id;
		return this;
	}

	public ScatterDataItem setId(String id) {
		this.id = id;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object name;

	public ScatterDataItem setName(Number name) {
		this.name = name;
		return this;
	}

	public ScatterDataItem setName(String name) {
		this.name = name;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object groupId;

	public ScatterDataItem setGroupId(Number groupId) {
		this.groupId = groupId;
		return this;
	}

	public ScatterDataItem setGroupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	private Boolean selected;
}
