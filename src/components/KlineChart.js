/**
 * Created by jiagang on 15/11/13.
 */
import React, {StyleSheet} from 'react-native';
import DZHChart from 'DZHChart';

import DZHYunComponent from './dzhyun/DZHYunComponent.js';
import * as baseStyle from './baseStyle.js';
import BaseComponent from './BaseComponent.js';
import Loading from './Loading.js';

export default class KlineChart extends BaseComponent {

  styleSheet = StyleSheet.create({
    chart: {
      flex: 1
    }
  });

  render() {
    return (
      <DZHChart style={this.getStyles('chart')} chartData={{
        chartType: 'kline',
        stkInfo: this.props.stkInfo,
        color: {
          ShangZhangYanSe: baseStyle.RED,
          XiaDieYanSe: baseStyle.DOWN_COLOR,
          BeiJingYanSe: baseStyle.DEFAULT_BACKGROUND_COLOR
        },
        chartData: this.props.chartData
      }}></DZHChart>
    );
  }
}

import {connection} from './dzhyun/DZHYunConnection.js';

export class DZHKlineChart extends DZHYunComponent {

  static defaultProps = {
    serviceUrl: '/quote/kline'
  };

  constructor(props) {
    super(props);

    this.defaultParams = {
      period: '1day',
      split: 1,
      start: -80
    };
  }

  adapt(data) {
    return data[0].Data;
  }

  _query(props) {
    super._query(props);
    this.setState({data: null});
  }

  render() {
    if (!this.state.data) {
      return <Loading></Loading>;
    } else {
      return <KlineChart style={this.props.style} chartData={this.state.data} stkInfo={{Obj: this.props.params.obj, MingCheng: this.props.name || ''}}></KlineChart>;
    }
  }
}