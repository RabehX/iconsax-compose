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

val Iconsax.Outline.FavoriteChart: ImageVector
    get() {
        if (_FavoriteChart != null) {
            return _FavoriteChart!!
        }
        _FavoriteChart = ImageVector.Builder(
            name = "Outline.FavoriteChart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(13f)
                curveTo(22.75f, 13.41f, 22.41f, 13.75f, 22f, 13.75f)
                curveTo(21.59f, 13.75f, 21.25f, 13.41f, 21.25f, 13f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 21.25f, 13.75f, 21.59f, 13.75f, 22f)
                curveTo(13.75f, 22.41f, 13.41f, 22.75f, 13f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.33f, 15.24f)
                curveTo(7.17f, 15.24f, 7.01f, 15.19f, 6.87f, 15.08f)
                curveTo(6.54f, 14.83f, 6.48f, 14.36f, 6.73f, 14.03f)
                lineTo(9.11f, 10.94f)
                curveTo(9.4f, 10.57f, 9.81f, 10.33f, 10.28f, 10.27f)
                curveTo(10.75f, 10.21f, 11.21f, 10.34f, 11.58f, 10.63f)
                lineTo(13.41f, 12.07f)
                curveTo(13.48f, 12.13f, 13.55f, 12.12f, 13.6f, 12.12f)
                curveTo(13.64f, 12.12f, 13.71f, 12.1f, 13.77f, 12.02f)
                lineTo(16.08f, 9.04f)
                curveTo(16.33f, 8.71f, 16.8f, 8.65f, 17.13f, 8.91f)
                curveTo(17.46f, 9.16f, 17.52f, 9.63f, 17.26f, 9.96f)
                lineTo(14.95f, 12.94f)
                curveTo(14.66f, 13.31f, 14.25f, 13.55f, 13.78f, 13.6f)
                curveTo(13.32f, 13.66f, 12.85f, 13.53f, 12.49f, 13.24f)
                lineTo(10.66f, 11.8f)
                curveTo(10.59f, 11.74f, 10.51f, 11.74f, 10.47f, 11.75f)
                curveTo(10.43f, 11.75f, 10.36f, 11.77f, 10.3f, 11.85f)
                lineTo(7.92f, 14.94f)
                curveTo(7.78f, 15.14f, 7.56f, 15.24f, 7.33f, 15.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.26f, 22.75f)
                curveTo(19.91f, 22.75f, 19.46f, 22.64f, 18.93f, 22.32f)
                lineTo(18.68f, 22.17f)
                curveTo(18.61f, 22.13f, 18.4f, 22.13f, 18.33f, 22.17f)
                lineTo(18.08f, 22.32f)
                curveTo(16.93f, 23.01f, 16.201f, 22.72f, 15.88f, 22.48f)
                curveTo(15.55f, 22.24f, 15.04f, 21.64f, 15.34f, 20.32f)
                lineTo(15.391f, 20.11f)
                curveTo(15.41f, 20.03f, 15.35f, 19.84f, 15.3f, 19.78f)
                lineTo(14.95f, 19.43f)
                curveTo(14.361f, 18.83f, 14.13f, 18.13f, 14.33f, 17.5f)
                curveTo(14.53f, 16.88f, 15.12f, 16.44f, 15.95f, 16.3f)
                lineTo(16.33f, 16.24f)
                curveTo(16.4f, 16.22f, 16.54f, 16.12f, 16.58f, 16.05f)
                lineTo(16.86f, 15.48f)
                curveTo(17.25f, 14.69f, 17.851f, 14.24f, 18.51f, 14.24f)
                curveTo(19.17f, 14.24f, 19.771f, 14.69f, 20.16f, 15.48f)
                lineTo(20.441f, 16.04f)
                curveTo(20.48f, 16.11f, 20.621f, 16.21f, 20.691f, 16.23f)
                lineTo(21.07f, 16.29f)
                curveTo(21.9f, 16.43f, 22.49f, 16.87f, 22.691f, 17.49f)
                curveTo(22.89f, 18.11f, 22.67f, 18.81f, 22.07f, 19.42f)
                lineTo(21.721f, 19.77f)
                curveTo(21.67f, 19.83f, 21.611f, 20.02f, 21.631f, 20.1f)
                lineTo(21.68f, 20.31f)
                curveTo(21.98f, 21.63f, 21.471f, 22.23f, 21.14f, 22.47f)
                curveTo(20.961f, 22.61f, 20.67f, 22.75f, 20.26f, 22.75f)
                close()
                moveTo(18.49f, 15.75f)
                curveTo(18.48f, 15.76f, 18.34f, 15.86f, 18.201f, 16.15f)
                lineTo(17.92f, 16.72f)
                curveTo(17.681f, 17.21f, 17.11f, 17.63f, 16.58f, 17.72f)
                lineTo(16.201f, 17.78f)
                curveTo(15.88f, 17.83f, 15.771f, 17.94f, 15.76f, 17.96f)
                curveTo(15.76f, 17.98f, 15.79f, 18.14f, 16.02f, 18.37f)
                lineTo(16.37f, 18.72f)
                curveTo(16.78f, 19.14f, 16.99f, 19.86f, 16.86f, 20.43f)
                lineTo(16.81f, 20.64f)
                curveTo(16.72f, 21.03f, 16.76f, 21.2f, 16.78f, 21.26f)
                curveTo(16.81f, 21.24f, 16.98f, 21.22f, 17.31f, 21.02f)
                lineTo(17.56f, 20.87f)
                curveTo(18.11f, 20.54f, 18.9f, 20.54f, 19.451f, 20.87f)
                lineTo(19.701f, 21.02f)
                curveTo(20.111f, 21.27f, 20.281f, 21.24f, 20.291f, 21.24f)
                curveTo(20.25f, 21.24f, 20.3f, 21.04f, 20.21f, 20.64f)
                lineTo(20.16f, 20.43f)
                curveTo(20.031f, 19.85f, 20.24f, 19.14f, 20.65f, 18.72f)
                lineTo(21f, 18.37f)
                curveTo(21.23f, 18.14f, 21.26f, 17.98f, 21.26f, 17.95f)
                curveTo(21.25f, 17.93f, 21.14f, 17.83f, 20.82f, 17.77f)
                lineTo(20.441f, 17.71f)
                curveTo(19.9f, 17.62f, 19.34f, 17.2f, 19.101f, 16.71f)
                lineTo(18.82f, 16.15f)
                curveTo(18.66f, 15.85f, 18.52f, 15.76f, 18.49f, 15.75f)
                close()
            }
        }.build()

        return _FavoriteChart!!
    }

@Suppress("ObjectPropertyName")
private var _FavoriteChart: ImageVector? = null
