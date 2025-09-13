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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.Backward: ImageVector
    get() {
        if (_Backward != null) {
            return _Backward!!
        }
        _Backward = ImageVector.Builder(
            name = "Filled.Backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.998f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(21.998f, 17.16f, 20.368f, 18.1f, 19.068f, 17.35f)
                lineTo(15.898f, 15.52f)
                lineTo(12.728f, 13.69f)
                lineTo(12.238f, 13.41f)
                verticalLineTo(10.59f)
                lineTo(12.728f, 10.31f)
                lineTo(15.898f, 8.48f)
                lineTo(19.068f, 6.65f)
                curveTo(20.368f, 5.9f, 21.998f, 6.84f, 21.998f, 8.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.241f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(12.241f, 17.16f, 10.611f, 18.1f, 9.321f, 17.35f)
                lineTo(6.141f, 15.52f)
                lineTo(2.971f, 13.69f)
                curveTo(1.681f, 12.94f, 1.681f, 11.06f, 2.971f, 10.31f)
                lineTo(6.141f, 8.48f)
                lineTo(9.321f, 6.65f)
                curveTo(10.611f, 5.9f, 12.241f, 6.84f, 12.241f, 8.34f)
                close()
            }
        }.build()

        return _Backward!!
    }

@Suppress("ObjectPropertyName")
private var _Backward: ImageVector? = null
