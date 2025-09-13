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


val Iconsax.Filled.LikeDislike: ImageVector
    get() {
        if (_LikeDislike != null) {
            return _LikeDislike!!
        }
        _LikeDislike = ImageVector.Builder(
            name = "Filled.LikeDislike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.15f, 15.371f)
                curveTo(12.93f, 15.051f, 12.54f, 14.871f, 12.09f, 14.871f)
                horizontalLineTo(9.76f)
                curveTo(9.61f, 14.871f, 9.46f, 14.811f, 9.37f, 14.691f)
                curveTo(9.27f, 14.571f, 9.23f, 14.421f, 9.25f, 14.251f)
                lineTo(9.54f, 12.391f)
                curveTo(9.66f, 11.841f, 9.29f, 11.211f, 8.74f, 11.021f)
                curveTo(8.22f, 10.831f, 7.62f, 11.091f, 7.37f, 11.461f)
                lineTo(5.06f, 14.901f)
                verticalLineTo(14.471f)
                curveTo(5.06f, 13.631f, 4.7f, 13.291f, 3.82f, 13.291f)
                horizontalLineTo(3.24f)
                curveTo(2.36f, 13.301f, 2f, 13.641f, 2f, 14.481f)
                verticalLineTo(20.191f)
                curveTo(2f, 21.031f, 2.36f, 21.371f, 3.24f, 21.371f)
                horizontalLineTo(3.82f)
                curveTo(4.66f, 21.371f, 5.01f, 21.041f, 5.04f, 20.281f)
                lineTo(6.79f, 21.631f)
                curveTo(7.04f, 21.871f, 7.57f, 22.001f, 7.95f, 22.001f)
                horizontalLineTo(10.16f)
                curveTo(10.92f, 22.001f, 11.68f, 21.431f, 11.86f, 20.731f)
                lineTo(13.26f, 16.481f)
                curveTo(13.41f, 16.071f, 13.37f, 15.681f, 13.15f, 15.371f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.111f, 2.61f)
                horizontalLineTo(20.531f)
                curveTo(19.691f, 2.61f, 19.341f, 2.94f, 19.301f, 3.7f)
                lineTo(17.551f, 2.35f)
                curveTo(17.311f, 2.11f, 16.771f, 1.98f, 16.391f, 1.98f)
                horizontalLineTo(14.181f)
                curveTo(13.421f, 1.98f, 12.661f, 2.55f, 12.481f, 3.25f)
                lineTo(11.081f, 7.5f)
                curveTo(10.931f, 7.91f, 10.981f, 8.3f, 11.191f, 8.61f)
                curveTo(11.411f, 8.93f, 11.801f, 9.11f, 12.251f, 9.11f)
                horizontalLineTo(14.581f)
                curveTo(14.731f, 9.11f, 14.881f, 9.17f, 14.971f, 9.29f)
                curveTo(15.071f, 9.41f, 15.111f, 9.56f, 15.091f, 9.73f)
                lineTo(14.801f, 11.59f)
                curveTo(14.681f, 12.141f, 15.051f, 12.771f, 15.601f, 12.96f)
                curveTo(16.121f, 13.151f, 16.721f, 12.891f, 16.971f, 12.521f)
                lineTo(19.281f, 9.08f)
                verticalLineTo(9.51f)
                curveTo(19.281f, 10.351f, 19.641f, 10.691f, 20.521f, 10.691f)
                horizontalLineTo(21.101f)
                curveTo(21.981f, 10.691f, 22.341f, 10.351f, 22.341f, 9.51f)
                verticalLineTo(3.78f)
                curveTo(22.351f, 2.95f, 21.991f, 2.61f, 21.111f, 2.61f)
                close()
            }
        }.build()

        return _LikeDislike!!
    }

@Suppress("ObjectPropertyName")
private var _LikeDislike: ImageVector? = null
