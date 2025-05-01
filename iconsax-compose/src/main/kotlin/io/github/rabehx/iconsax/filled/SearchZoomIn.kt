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


val Iconsax.Filled.SearchZoomIn: ImageVector
    get() {
        if (_SearchZoomIn != null) {
            return _SearchZoomIn!!
        }
        _SearchZoomIn = ImageVector.Builder(
            name = "Filled.SearchZoomIn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.01f, 2f)
                curveTo(6.04f, 2f, 2f, 6.04f, 2f, 11.01f)
                curveTo(2f, 15.98f, 6.04f, 20.02f, 11.01f, 20.02f)
                curveTo(15.98f, 20.02f, 20.02f, 15.98f, 20.02f, 11.01f)
                curveTo(20.02f, 6.04f, 15.98f, 2f, 11.01f, 2f)
                close()
                moveTo(13.5f, 11.75f)
                horizontalLineTo(11.75f)
                verticalLineTo(13.5f)
                curveTo(11.75f, 13.91f, 11.41f, 14.25f, 11f, 14.25f)
                curveTo(10.59f, 14.25f, 10.25f, 13.91f, 10.25f, 13.5f)
                verticalLineTo(11.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.75f, 7.75f, 11.41f, 7.75f, 11f)
                curveTo(7.75f, 10.59f, 8.09f, 10.25f, 8.5f, 10.25f)
                horizontalLineTo(10.25f)
                verticalLineTo(8.5f)
                curveTo(10.25f, 8.09f, 10.59f, 7.75f, 11f, 7.75f)
                curveTo(11.41f, 7.75f, 11.75f, 8.09f, 11.75f, 8.5f)
                verticalLineTo(10.25f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 10.25f, 14.25f, 10.59f, 14.25f, 11f)
                curveTo(14.25f, 11.41f, 13.91f, 11.75f, 13.5f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.99f, 18.95f)
                curveTo(21.66f, 18.34f, 20.96f, 18f, 20.02f, 18f)
                curveTo(19.31f, 18f, 18.7f, 18.29f, 18.34f, 18.79f)
                curveTo(17.98f, 19.29f, 17.9f, 19.96f, 18.12f, 20.63f)
                curveTo(18.55f, 21.93f, 19.3f, 22.22f, 19.71f, 22.27f)
                curveTo(19.77f, 22.28f, 19.83f, 22.28f, 19.9f, 22.28f)
                curveTo(20.34f, 22.28f, 21.02f, 22.09f, 21.68f, 21.1f)
                curveTo(22.21f, 20.33f, 22.31f, 19.56f, 21.99f, 18.95f)
                close()
            }
        }.build()

        return _SearchZoomIn!!
    }

@Suppress("ObjectPropertyName")
private var _SearchZoomIn: ImageVector? = null
