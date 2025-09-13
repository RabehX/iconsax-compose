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

val Iconsax.Outline.VideoSlash: ImageVector
    get() {
        if (_VideoSlash != null) {
            return _VideoSlash!!
        }
        _VideoSlash = ImageVector.Builder(
            name = "Outline.VideoSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.3f, 19.92f)
                curveTo(4.13f, 19.92f, 3.96f, 19.86f, 3.82f, 19.75f)
                curveTo(2.81f, 18.92f, 2.25f, 17.59f, 2.25f, 16f)
                verticalLineTo(8f)
                curveTo(2.25f, 4.58f, 3.58f, 3.25f, 7f, 3.25f)
                horizontalLineTo(13f)
                curveTo(15.04f, 3.25f, 17.18f, 3.63f, 17.64f, 6.48f)
                curveTo(17.71f, 6.89f, 17.43f, 7.27f, 17.02f, 7.34f)
                curveTo(16.61f, 7.41f, 16.23f, 7.13f, 16.16f, 6.72f)
                curveTo(15.95f, 5.42f, 15.4f, 4.75f, 13f, 4.75f)
                horizontalLineTo(7f)
                curveTo(4.42f, 4.75f, 3.75f, 5.42f, 3.75f, 8f)
                verticalLineTo(16f)
                curveTo(3.75f, 16.65f, 3.88f, 17.86f, 4.77f, 18.59f)
                curveTo(5.09f, 18.85f, 5.14f, 19.33f, 4.87f, 19.65f)
                curveTo(4.73f, 19.83f, 4.51f, 19.92f, 4.3f, 19.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 20.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 20.75f, 7.25f, 20.41f, 7.25f, 20f)
                curveTo(7.25f, 19.59f, 7.59f, 19.25f, 8f, 19.25f)
                horizontalLineTo(13f)
                curveTo(15.58f, 19.25f, 16.25f, 18.58f, 16.25f, 16f)
                verticalLineTo(11f)
                curveTo(16.25f, 10.59f, 16.59f, 10.25f, 17f, 10.25f)
                curveTo(17.41f, 10.25f, 17.75f, 10.59f, 17.75f, 11f)
                verticalLineTo(16f)
                curveTo(17.75f, 19.42f, 16.42f, 20.75f, 13f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.8f, 18.04f)
                curveTo(20.37f, 18.04f, 19.84f, 17.9f, 19.21f, 17.46f)
                lineTo(16.57f, 15.61f)
                curveTo(16.23f, 15.37f, 16.15f, 14.9f, 16.39f, 14.57f)
                curveTo(16.63f, 14.23f, 17.09f, 14.15f, 17.43f, 14.39f)
                lineTo(20.07f, 16.24f)
                curveTo(20.51f, 16.55f, 20.83f, 16.58f, 20.96f, 16.51f)
                curveTo(21.09f, 16.44f, 21.25f, 16.17f, 21.25f, 15.63f)
                verticalLineTo(7f)
                curveTo(21.25f, 6.59f, 21.59f, 6.25f, 22f, 6.25f)
                curveTo(22.41f, 6.25f, 22.75f, 6.59f, 22.75f, 7f)
                verticalLineTo(15.62f)
                curveTo(22.75f, 17.05f, 22.06f, 17.62f, 21.65f, 17.83f)
                curveTo(21.46f, 17.93f, 21.17f, 18.04f, 20.8f, 18.04f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.021f, 22.94f)
                curveTo(1.831f, 22.94f, 1.641f, 22.87f, 1.491f, 22.72f)
                curveTo(1.201f, 22.43f, 1.201f, 21.95f, 1.491f, 21.66f)
                lineTo(21.491f, 1.66f)
                curveTo(21.781f, 1.37f, 22.261f, 1.37f, 22.551f, 1.66f)
                curveTo(22.841f, 1.95f, 22.841f, 2.43f, 22.551f, 2.72f)
                lineTo(2.551f, 22.72f)
                curveTo(2.411f, 22.87f, 2.211f, 22.94f, 2.021f, 22.94f)
                close()
            }
        }.build()

        return _VideoSlash!!
    }

@Suppress("ObjectPropertyName")
private var _VideoSlash: ImageVector? = null
