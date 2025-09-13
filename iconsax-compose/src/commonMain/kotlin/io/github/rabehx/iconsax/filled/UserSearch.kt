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


val Iconsax.Filled.UserSearch: ImageVector
    get() {
        if (_UserSearch != null) {
            return _UserSearch!!
        }
        _UserSearch = ImageVector.Builder(
            name = "Filled.UserSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14f)
                curveTo(6.99f, 14f, 2.91f, 17.36f, 2.91f, 21.5f)
                curveTo(2.91f, 21.78f, 3.13f, 22f, 3.41f, 22f)
                horizontalLineTo(20.59f)
                curveTo(20.87f, 22f, 21.09f, 21.78f, 21.09f, 21.5f)
                curveTo(21.09f, 17.36f, 17.01f, 14f, 12f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.72f, 10.35f)
                lineTo(15.76f, 9.39f)
                curveTo(16.26f, 8.64f, 16.55f, 7.74f, 16.55f, 6.77f)
                curveTo(16.55f, 4.13f, 14.41f, 2f, 11.78f, 2f)
                curveTo(9.15f, 2f, 7f, 4.14f, 7f, 6.77f)
                curveTo(7f, 9.4f, 9.14f, 11.54f, 11.77f, 11.54f)
                curveTo(12.74f, 11.54f, 13.64f, 11.25f, 14.39f, 10.75f)
                lineTo(15.35f, 11.71f)
                curveTo(15.54f, 11.9f, 15.79f, 11.99f, 16.03f, 11.99f)
                curveTo(16.28f, 11.99f, 16.53f, 11.9f, 16.71f, 11.71f)
                curveTo(17.09f, 11.34f, 17.09f, 10.73f, 16.72f, 10.35f)
                close()
            }
        }.build()

        return _UserSearch!!
    }

@Suppress("ObjectPropertyName")
private var _UserSearch: ImageVector? = null
