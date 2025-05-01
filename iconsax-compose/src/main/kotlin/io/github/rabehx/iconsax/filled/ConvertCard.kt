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

val Iconsax.Filled.ConvertCard: ImageVector
    get() {
        if (_ConvertCard != null) {
            return _ConvertCard!!
        }
        _ConvertCard = ImageVector.Builder(
            name = "Filled.ConvertCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(22f, 4.2f)
                verticalLineTo(4.31f)
                curveTo(22f, 4.59f, 21.78f, 4.81f, 21.5f, 4.81f)
                horizontalLineTo(12.5f)
                curveTo(12.22f, 4.81f, 12f, 4.59f, 12f, 4.31f)
                verticalLineTo(4.2f)
                curveTo(12f, 2.44f, 12.44f, 2f, 14.22f, 2f)
                horizontalLineTo(19.78f)
                curveTo(21.56f, 2f, 22f, 2.44f, 22f, 4.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 5.809f)
                curveTo(12.22f, 5.809f, 12f, 6.029f, 12f, 6.309f)
                verticalLineTo(7.309f)
                verticalLineTo(8.299f)
                curveTo(12f, 10.059f, 12.44f, 10.499f, 14.22f, 10.499f)
                horizontalLineTo(19.78f)
                curveTo(21.56f, 10.499f, 22f, 10.059f, 22f, 8.299f)
                verticalLineTo(7.309f)
                verticalLineTo(6.309f)
                curveTo(22f, 6.029f, 21.78f, 5.809f, 21.5f, 5.809f)
                horizontalLineTo(12.5f)
                close()
            }
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
        }.build()

        return _ConvertCard!!
    }

@Suppress("ObjectPropertyName")
private var _ConvertCard: ImageVector? = null
