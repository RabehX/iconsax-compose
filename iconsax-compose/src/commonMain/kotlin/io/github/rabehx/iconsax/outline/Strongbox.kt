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

val Iconsax.Outline.Strongbox: ImageVector
    get() {
        if (_Strongbox != null) {
            return _Strongbox!!
        }
        _Strongbox = ImageVector.Builder(
            name = "Outline.Strongbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 16.56f)
                curveTo(10.901f, 16.56f, 10.001f, 15.66f, 10.001f, 14.56f)
                verticalLineTo(12.96f)
                curveTo(9.411f, 12.47f, 9.011f, 11.78f, 8.911f, 11.01f)
                curveTo(8.891f, 10.89f, 8.871f, 10.72f, 8.871f, 10.56f)
                curveTo(8.871f, 9.59f, 9.311f, 8.69f, 10.091f, 8.09f)
                curveTo(10.871f, 7.49f, 11.871f, 7.3f, 12.831f, 7.55f)
                curveTo(13.881f, 7.83f, 14.751f, 8.69f, 15.021f, 9.74f)
                curveTo(15.131f, 10.15f, 15.161f, 10.58f, 15.091f, 11.01f)
                curveTo(14.981f, 11.77f, 14.591f, 12.46f, 14.001f, 12.95f)
                verticalLineTo(14.55f)
                curveTo(14.001f, 15.66f, 13.101f, 16.56f, 12.001f, 16.56f)
                close()
                moveTo(11.991f, 8.94f)
                curveTo(11.631f, 8.94f, 11.291f, 9.05f, 11.001f, 9.28f)
                curveTo(10.601f, 9.59f, 10.371f, 10.06f, 10.371f, 10.56f)
                curveTo(10.371f, 10.63f, 10.371f, 10.71f, 10.391f, 10.77f)
                curveTo(10.461f, 11.27f, 10.731f, 11.68f, 11.151f, 11.94f)
                lineTo(11.501f, 12.16f)
                verticalLineTo(14.56f)
                curveTo(11.501f, 14.84f, 11.721f, 15.06f, 12.001f, 15.06f)
                curveTo(12.281f, 15.06f, 12.501f, 14.84f, 12.501f, 14.56f)
                verticalLineTo(12.16f)
                lineTo(12.851f, 11.94f)
                curveTo(13.261f, 11.68f, 13.541f, 11.27f, 13.601f, 10.8f)
                verticalLineTo(10.78f)
                curveTo(13.641f, 10.56f, 13.631f, 10.34f, 13.571f, 10.13f)
                curveTo(13.431f, 9.58f, 12.981f, 9.14f, 12.441f, 9f)
                curveTo(12.291f, 8.96f, 12.141f, 8.94f, 11.991f, 8.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.16f)
                horizontalLineTo(14.35f)
                verticalLineTo(11.66f)
                horizontalLineTo(22f)
                verticalLineTo(10.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.65f, 10.16f)
                horizontalLineTo(2f)
                verticalLineTo(11.66f)
                horizontalLineTo(9.65f)
                verticalLineTo(10.16f)
                close()
            }
        }.build()

        return _Strongbox!!
    }

@Suppress("ObjectPropertyName")
private var _Strongbox: ImageVector? = null
