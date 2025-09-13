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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Simcard1: ImageVector
    get() {
        if (_Simcard1 != null) {
            return _Simcard1!!
        }
        _Simcard1 = ImageVector.Builder(
            name = "Outline.Simcard1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.56f, 22.75f, 2.25f, 20.44f, 2.25f, 17f)
                verticalLineTo(7f)
                curveTo(2.25f, 3.56f, 4.56f, 1.25f, 8f, 1.25f)
                horizontalLineTo(12.93f)
                curveTo(14.47f, 1.25f, 15.91f, 1.85f, 17f, 2.93f)
                lineTo(20.07f, 6f)
                curveTo(21.16f, 7.08f, 21.75f, 8.53f, 21.75f, 10.07f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.44f, 19.44f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 2.75f)
                curveTo(5.42f, 2.75f, 3.75f, 4.42f, 3.75f, 7f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.58f, 5.42f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.58f, 21.25f, 20.25f, 19.58f, 20.25f, 17f)
                verticalLineTo(10.07f)
                curveTo(20.25f, 8.93f, 19.81f, 7.87f, 19f, 7.07f)
                lineTo(15.93f, 4f)
                curveTo(15.13f, 3.2f, 14.06f, 2.76f, 12.92f, 2.76f)
                horizontalLineTo(8f)
                verticalLineTo(2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.499f, 18.75f)
                curveTo(9.309f, 18.75f, 9.119f, 18.68f, 8.969f, 18.53f)
                lineTo(6.969f, 16.53f)
                curveTo(6.679f, 16.24f, 6.679f, 15.76f, 6.969f, 15.47f)
                lineTo(8.969f, 13.47f)
                curveTo(9.259f, 13.18f, 9.739f, 13.18f, 10.03f, 13.47f)
                curveTo(10.319f, 13.76f, 10.319f, 14.24f, 10.03f, 14.53f)
                lineTo(8.559f, 16f)
                lineTo(10.03f, 17.47f)
                curveTo(10.319f, 17.76f, 10.319f, 18.24f, 10.03f, 18.53f)
                curveTo(9.879f, 18.68f, 9.689f, 18.75f, 9.499f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 18.75f)
                curveTo(14.309f, 18.75f, 14.12f, 18.68f, 13.969f, 18.53f)
                curveTo(13.679f, 18.24f, 13.679f, 17.76f, 13.969f, 17.47f)
                lineTo(15.439f, 16f)
                lineTo(13.969f, 14.53f)
                curveTo(13.679f, 14.24f, 13.679f, 13.76f, 13.969f, 13.47f)
                curveTo(14.259f, 13.18f, 14.74f, 13.18f, 15.03f, 13.47f)
                lineTo(17.029f, 15.47f)
                curveTo(17.319f, 15.76f, 17.319f, 16.24f, 17.029f, 16.53f)
                lineTo(15.03f, 18.53f)
                curveTo(14.88f, 18.68f, 14.689f, 18.75f, 14.5f, 18.75f)
                close()
            }
        }.build()

        return _Simcard1!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard1: ImageVector? = null
