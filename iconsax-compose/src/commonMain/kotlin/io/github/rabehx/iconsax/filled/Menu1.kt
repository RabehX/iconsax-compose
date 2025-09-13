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


val Iconsax.Filled.Menu1: ImageVector
    get() {
        if (_Menu1 != null) {
            return _Menu1!!
        }
        _Menu1 = ImageVector.Builder(
            name = "Filled.Menu1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(17f, 17.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 17.25f, 6.25f, 16.91f, 6.25f, 16.5f)
                curveTo(6.25f, 16.09f, 6.59f, 15.75f, 7f, 15.75f)
                horizontalLineTo(17f)
                curveTo(17.41f, 15.75f, 17.75f, 16.09f, 17.75f, 16.5f)
                curveTo(17.75f, 16.91f, 17.41f, 17.25f, 17f, 17.25f)
                close()
                moveTo(17f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7f, 11.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 11.25f, 17.75f, 11.59f, 17.75f, 12f)
                curveTo(17.75f, 12.41f, 17.41f, 12.75f, 17f, 12.75f)
                close()
                moveTo(17f, 8.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 8.25f, 6.25f, 7.91f, 6.25f, 7.5f)
                curveTo(6.25f, 7.09f, 6.59f, 6.75f, 7f, 6.75f)
                horizontalLineTo(17f)
                curveTo(17.41f, 6.75f, 17.75f, 7.09f, 17.75f, 7.5f)
                curveTo(17.75f, 7.91f, 17.41f, 8.25f, 17f, 8.25f)
                close()
            }
        }.build()

        return _Menu1!!
    }

@Suppress("ObjectPropertyName")
private var _Menu1: ImageVector? = null
