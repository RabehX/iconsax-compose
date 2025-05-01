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


val Iconsax.Filled.Export2: ImageVector
    get() {
        if (_Export2 != null) {
            return _Export2!!
        }
        _Export2 = ImageVector.Builder(
            name = "Filled.Export2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.14f, 9.898f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.378f)
                curveTo(12.75f, 15.788f, 12.41f, 16.128f, 12f, 16.128f)
                curveTo(11.59f, 16.128f, 11.25f, 15.788f, 11.25f, 15.378f)
                verticalLineTo(9.898f)
                horizontalLineTo(2.86f)
                curveTo(2.38f, 9.898f, 2f, 10.278f, 2f, 10.758f)
                curveTo(2f, 16.648f, 6.11f, 20.758f, 12f, 20.758f)
                curveTo(17.89f, 20.758f, 22f, 16.648f, 22f, 10.758f)
                curveTo(22f, 10.278f, 21.62f, 9.898f, 21.14f, 9.898f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.748f, 5.8f)
                lineTo(14.308f, 7.36f)
                curveTo(14.598f, 7.65f, 15.078f, 7.65f, 15.368f, 7.36f)
                curveTo(15.658f, 7.07f, 15.658f, 6.59f, 15.368f, 6.3f)
                lineTo(12.518f, 3.46f)
                curveTo(12.228f, 3.17f, 11.748f, 3.17f, 11.458f, 3.46f)
                lineTo(8.618f, 6.31f)
                curveTo(8.478f, 6.46f, 8.398f, 6.65f, 8.398f, 6.84f)
                curveTo(8.398f, 7.03f, 8.468f, 7.22f, 8.618f, 7.37f)
                curveTo(8.908f, 7.66f, 9.388f, 7.66f, 9.678f, 7.37f)
                lineTo(11.238f, 5.81f)
                verticalLineTo(9.9f)
                horizontalLineTo(12.738f)
                verticalLineTo(5.8f)
                horizontalLineTo(12.748f)
                close()
            }
        }.build()

        return _Export2!!
    }

@Suppress("ObjectPropertyName")
private var _Export2: ImageVector? = null
