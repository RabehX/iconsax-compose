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


val Iconsax.Filled.Mouse: ImageVector
    get() {
        if (_Mouse != null) {
            return _Mouse!!
        }
        _Mouse = ImageVector.Builder(
            name = "Filled.Mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.298f, 2.115f)
                curveTo(13.006f, 2.063f, 12.75f, 2.296f, 12.75f, 2.592f)
                verticalLineTo(5.453f)
                curveTo(12.75f, 5.651f, 12.871f, 5.826f, 13.036f, 5.936f)
                curveTo(13.539f, 6.272f, 13.87f, 6.846f, 13.87f, 7.499f)
                verticalLineTo(9.499f)
                curveTo(13.87f, 10.529f, 13.03f, 11.379f, 12f, 11.379f)
                curveTo(10.96f, 11.379f, 10.12f, 10.529f, 10.12f, 9.499f)
                verticalLineTo(7.499f)
                curveTo(10.12f, 6.846f, 10.458f, 6.272f, 10.964f, 5.936f)
                curveTo(11.129f, 5.826f, 11.25f, 5.651f, 11.25f, 5.453f)
                verticalLineTo(2.592f)
                curveTo(11.25f, 2.296f, 10.993f, 2.064f, 10.702f, 2.115f)
                curveTo(9.152f, 2.388f, 7.766f, 3.133f, 6.7f, 4.199f)
                curveTo(5.34f, 5.559f, 4.5f, 7.439f, 4.5f, 9.499f)
                verticalLineTo(14.499f)
                curveTo(4.5f, 18.629f, 7.87f, 21.999f, 12f, 21.999f)
                curveTo(16.13f, 21.999f, 19.5f, 18.629f, 19.5f, 14.499f)
                verticalLineTo(9.499f)
                curveTo(19.5f, 5.809f, 16.813f, 2.733f, 13.298f, 2.115f)
                close()
            }
        }.build()

        return _Mouse!!
    }

@Suppress("ObjectPropertyName")
private var _Mouse: ImageVector? = null
