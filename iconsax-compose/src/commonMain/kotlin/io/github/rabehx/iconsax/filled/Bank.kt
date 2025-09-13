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

val Iconsax.Filled.Bank: ImageVector
    get() {
        if (_Bank != null) {
            return _Bank!!
        }
        _Bank = ImageVector.Builder(
            name = "Filled.Bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                curveTo(2f, 18.45f, 2.45f, 18f, 3f, 18f)
                horizontalLineTo(21f)
                curveTo(21.55f, 18f, 22f, 18.45f, 22f, 19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(23f, 22.75f)
                horizontalLineTo(1f)
                curveTo(0.59f, 22.75f, 0.25f, 22.41f, 0.25f, 22f)
                curveTo(0.25f, 21.59f, 0.59f, 21.25f, 1f, 21.25f)
                horizontalLineTo(23f)
                curveTo(23.41f, 21.25f, 23.75f, 21.59f, 23.75f, 22f)
                curveTo(23.75f, 22.41f, 23.41f, 22.75f, 23f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.37f, 5.75f)
                lineTo(12.37f, 2.15f)
                curveTo(12.17f, 2.07f, 11.83f, 2.07f, 11.63f, 2.15f)
                lineTo(2.63f, 5.75f)
                curveTo(2.28f, 5.89f, 2f, 6.3f, 2f, 6.68f)
                verticalLineTo(10f)
                curveTo(2f, 10.55f, 2.45f, 11f, 3f, 11f)
                horizontalLineTo(21f)
                curveTo(21.55f, 11f, 22f, 10.55f, 22f, 10f)
                verticalLineTo(6.68f)
                curveTo(22f, 6.3f, 21.72f, 5.89f, 21.37f, 5.75f)
                close()
                moveTo(12f, 8.5f)
                curveTo(11.17f, 8.5f, 10.5f, 7.83f, 10.5f, 7f)
                curveTo(10.5f, 6.17f, 11.17f, 5.5f, 12f, 5.5f)
                curveTo(12.83f, 5.5f, 13.5f, 6.17f, 13.5f, 7f)
                curveTo(13.5f, 7.83f, 12.83f, 8.5f, 12f, 8.5f)
                close()
            }
        }.build()

        return _Bank!!
    }

@Suppress("ObjectPropertyName")
private var _Bank: ImageVector? = null
