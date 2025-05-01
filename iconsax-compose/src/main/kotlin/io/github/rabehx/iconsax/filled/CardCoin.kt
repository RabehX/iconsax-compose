/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.CardCoin: ImageVector
    get() {
        if (_CardCoin != null) {
            return _CardCoin!!
        }
        _CardCoin = ImageVector.Builder(
            name = "Filled.CardCoin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.7f)
                verticalLineTo(15.81f)
                curveTo(12f, 16.09f, 11.78f, 16.31f, 11.5f, 16.31f)
                horizontalLineTo(2.5f)
                curveTo(2.22f, 16.31f, 2f, 16.09f, 2f, 15.81f)
                verticalLineTo(15.7f)
                curveTo(2f, 13.94f, 2.44f, 13.5f, 4.22f, 13.5f)
                horizontalLineTo(9.78f)
                curveTo(11.56f, 13.5f, 12f, 13.94f, 12f, 15.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.5f, 17.309f)
                curveTo(2.22f, 17.309f, 2f, 17.529f, 2f, 17.809f)
                verticalLineTo(18.809f)
                verticalLineTo(19.799f)
                curveTo(2f, 21.559f, 2.44f, 21.999f, 4.22f, 21.999f)
                horizontalLineTo(9.78f)
                curveTo(11.56f, 21.999f, 12f, 21.559f, 12f, 19.799f)
                verticalLineTo(18.809f)
                verticalLineTo(17.809f)
                curveTo(12f, 17.529f, 11.78f, 17.309f, 11.5f, 17.309f)
                horizontalLineTo(2.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 15f)
                curveTo(22f, 18.87f, 18.87f, 22f, 15f, 22f)
                lineTo(16.05f, 20.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                lineTo(7.95f, 3.75f)
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 11f)
                curveTo(20.985f, 11f, 23f, 8.985f, 23f, 6.5f)
                curveTo(23f, 4.015f, 20.985f, 2f, 18.5f, 2f)
                curveTo(16.015f, 2f, 14f, 4.015f, 14f, 6.5f)
                curveTo(14f, 8.985f, 16.015f, 11f, 18.5f, 11f)
                close()
            }
        }.build()

        return _CardCoin!!
    }

@Suppress("ObjectPropertyName")
private var _CardCoin: ImageVector? = null
