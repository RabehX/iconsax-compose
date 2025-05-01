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

val Iconsax.Outline.GalleryRemove: ImageVector
    get() {
        if (_GalleryRemove != null) {
            return _GalleryRemove!!
        }
        _GalleryRemove = ImageVector.Builder(
            name = "Outline.GalleryRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 10.75f)
                curveTo(7.48f, 10.75f, 6.25f, 9.52f, 6.25f, 8f)
                curveTo(6.25f, 6.48f, 7.48f, 5.25f, 9f, 5.25f)
                curveTo(10.52f, 5.25f, 11.75f, 6.48f, 11.75f, 8f)
                curveTo(11.75f, 9.52f, 10.52f, 10.75f, 9f, 10.75f)
                close()
                moveTo(9f, 6.75f)
                curveTo(8.31f, 6.75f, 7.75f, 7.31f, 7.75f, 8f)
                curveTo(7.75f, 8.69f, 8.31f, 9.25f, 9f, 9.25f)
                curveTo(9.69f, 9.25f, 10.25f, 8.69f, 10.25f, 8f)
                curveTo(10.25f, 7.31f, 9.69f, 6.75f, 9f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 1.25f, 13.75f, 1.59f, 13.75f, 2f)
                curveTo(13.75f, 2.41f, 13.41f, 2.75f, 13f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.56f, 7.69f)
                curveTo(16.37f, 7.69f, 16.18f, 7.62f, 16.03f, 7.47f)
                curveTo(15.74f, 7.18f, 15.74f, 6.7f, 16.03f, 6.41f)
                lineTo(19.92f, 2.52f)
                curveTo(20.21f, 2.23f, 20.69f, 2.23f, 20.98f, 2.52f)
                curveTo(21.27f, 2.81f, 21.27f, 3.29f, 20.98f, 3.58f)
                lineTo(17.09f, 7.47f)
                curveTo(16.94f, 7.62f, 16.75f, 7.69f, 16.56f, 7.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.44f, 7.69f)
                curveTo(20.25f, 7.69f, 20.06f, 7.62f, 19.91f, 7.47f)
                lineTo(16.02f, 3.58f)
                curveTo(15.73f, 3.29f, 15.73f, 2.81f, 16.02f, 2.52f)
                curveTo(16.31f, 2.23f, 16.79f, 2.23f, 17.08f, 2.52f)
                lineTo(20.97f, 6.41f)
                curveTo(21.26f, 6.7f, 21.26f, 7.18f, 20.97f, 7.47f)
                curveTo(20.83f, 7.62f, 20.64f, 7.69f, 20.44f, 7.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.669f, 19.7f)
                curveTo(2.429f, 19.7f, 2.189f, 19.58f, 2.049f, 19.37f)
                curveTo(1.819f, 19.03f, 1.909f, 18.56f, 2.249f, 18.33f)
                lineTo(7.179f, 15.02f)
                curveTo(8.259f, 14.3f, 9.749f, 14.38f, 10.729f, 15.21f)
                lineTo(11.059f, 15.5f)
                curveTo(11.559f, 15.93f, 12.409f, 15.93f, 12.899f, 15.5f)
                lineTo(17.059f, 11.93f)
                curveTo(18.119f, 11.02f, 19.789f, 11.02f, 20.859f, 11.93f)
                lineTo(22.489f, 13.33f)
                curveTo(22.799f, 13.6f, 22.839f, 14.07f, 22.569f, 14.39f)
                curveTo(22.299f, 14.7f, 21.829f, 14.74f, 21.509f, 14.47f)
                lineTo(19.879f, 13.07f)
                curveTo(19.379f, 12.64f, 18.529f, 12.64f, 18.039f, 13.07f)
                lineTo(13.879f, 16.64f)
                curveTo(12.819f, 17.55f, 11.149f, 17.55f, 10.079f, 16.64f)
                lineTo(9.749f, 16.35f)
                curveTo(9.289f, 15.96f, 8.529f, 15.92f, 8.019f, 16.27f)
                lineTo(3.099f, 19.58f)
                curveTo(2.959f, 19.66f, 2.809f, 19.7f, 2.669f, 19.7f)
                close()
            }
        }.build()

        return _GalleryRemove!!
    }

@Suppress("ObjectPropertyName")
private var _GalleryRemove: ImageVector? = null
