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


val Iconsax.Filled.SearchNormal1: ImageVector
    get() {
        if (_SearchNormal1 != null) {
            return _SearchNormal1!!
        }
        _SearchNormal1 = ImageVector.Builder(
            name = "Filled.SearchNormal1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 21f)
                curveTo(16.747f, 21f, 21f, 16.747f, 21f, 11.5f)
                curveTo(21f, 6.253f, 16.747f, 2f, 11.5f, 2f)
                curveTo(6.253f, 2f, 2f, 6.253f, 2f, 11.5f)
                curveTo(2f, 16.747f, 6.253f, 21f, 11.5f, 21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.301f, 21.999f)
                curveTo(21.121f, 21.999f, 20.941f, 21.929f, 20.81f, 21.799f)
                lineTo(18.951f, 19.939f)
                curveTo(18.681f, 19.669f, 18.681f, 19.229f, 18.951f, 18.949f)
                curveTo(19.221f, 18.679f, 19.66f, 18.679f, 19.941f, 18.949f)
                lineTo(21.801f, 20.809f)
                curveTo(22.07f, 21.079f, 22.07f, 21.519f, 21.801f, 21.799f)
                curveTo(21.66f, 21.929f, 21.48f, 21.999f, 21.301f, 21.999f)
                close()
            }
        }.build()

        return _SearchNormal1!!
    }

@Suppress("ObjectPropertyName")
private var _SearchNormal1: ImageVector? = null
