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

val Iconsax.Outline.MessageTick: ImageVector
    get() {
        if (_MessageTick != null) {
            return _MessageTick!!
        }
        _MessageTick = ImageVector.Builder(
            name = "Outline.MessageTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.32f)
                curveTo(15.66f, 22.32f, 15.33f, 22.22f, 15.04f, 22.03f)
                lineTo(10.78f, 19.19f)
                horizontalLineTo(8.89f)
                curveTo(8.66f, 19.19f, 8.44f, 19.08f, 8.3f, 18.9f)
                curveTo(8.16f, 18.71f, 8.11f, 18.47f, 8.17f, 18.25f)
                curveTo(8.23f, 18.01f, 8.26f, 17.77f, 8.26f, 17.51f)
                curveTo(8.26f, 16.71f, 7.96f, 15.94f, 7.42f, 15.34f)
                curveTo(6.81f, 14.65f, 5.94f, 14.26f, 5.01f, 14.26f)
                curveTo(4.12f, 14.26f, 3.3f, 14.61f, 2.68f, 15.24f)
                curveTo(2.49f, 15.44f, 2.2f, 15.51f, 1.94f, 15.44f)
                curveTo(1.68f, 15.36f, 1.47f, 15.15f, 1.41f, 14.88f)
                curveTo(1.31f, 14.44f, 1.26f, 13.96f, 1.26f, 13.44f)
                verticalLineTo(7.44f)
                curveTo(1.26f, 4f, 3.57f, 1.69f, 7.01f, 1.69f)
                horizontalLineTo(17.01f)
                curveTo(20.45f, 1.69f, 22.76f, 4f, 22.76f, 7.44f)
                verticalLineTo(13.44f)
                curveTo(22.76f, 15.11f, 22.21f, 16.55f, 21.16f, 17.6f)
                curveTo(20.28f, 18.48f, 19.11f, 19.01f, 17.76f, 19.15f)
                verticalLineTo(20.57f)
                curveTo(17.76f, 21.22f, 17.4f, 21.81f, 16.83f, 22.12f)
                curveTo(16.56f, 22.25f, 16.28f, 22.32f, 16f, 22.32f)
                close()
                moveTo(9.75f, 17.68f)
                horizontalLineTo(11f)
                curveTo(11.15f, 17.68f, 11.29f, 17.72f, 11.42f, 17.81f)
                lineTo(15.87f, 20.78f)
                curveTo(15.98f, 20.85f, 16.07f, 20.82f, 16.12f, 20.79f)
                curveTo(16.17f, 20.76f, 16.26f, 20.7f, 16.26f, 20.56f)
                verticalLineTo(18.43f)
                curveTo(16.26f, 18.02f, 16.6f, 17.68f, 17.01f, 17.68f)
                curveTo(18.28f, 17.68f, 19.35f, 17.28f, 20.1f, 16.53f)
                curveTo(20.86f, 15.77f, 21.26f, 14.7f, 21.26f, 13.43f)
                verticalLineTo(7.43f)
                curveTo(21.26f, 4.85f, 19.59f, 3.18f, 17.01f, 3.18f)
                horizontalLineTo(7.01f)
                curveTo(4.43f, 3.18f, 2.76f, 4.85f, 2.76f, 7.43f)
                verticalLineTo(13.31f)
                curveTo(3.44f, 12.94f, 4.21f, 12.75f, 5.01f, 12.75f)
                curveTo(6.37f, 12.75f, 7.66f, 13.33f, 8.54f, 14.33f)
                curveTo(9.32f, 15.2f, 9.76f, 16.32f, 9.76f, 17.5f)
                curveTo(9.75f, 17.56f, 9.75f, 17.62f, 9.75f, 17.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22.25f)
                curveTo(3.34f, 22.25f, 1.78f, 21.37f, 0.94f, 19.94f)
                curveTo(0.49f, 19.22f, 0.25f, 18.37f, 0.25f, 17.5f)
                curveTo(0.25f, 16.04f, 0.9f, 14.69f, 2.03f, 13.79f)
                curveTo(2.87f, 13.12f, 3.93f, 12.75f, 5f, 12.75f)
                curveTo(7.62f, 12.75f, 9.75f, 14.88f, 9.75f, 17.5f)
                curveTo(9.75f, 18.37f, 9.51f, 19.22f, 9.06f, 19.95f)
                curveTo(8.81f, 20.37f, 8.49f, 20.75f, 8.11f, 21.07f)
                curveTo(7.28f, 21.83f, 6.17f, 22.25f, 5f, 22.25f)
                close()
                moveTo(5f, 14.25f)
                curveTo(4.26f, 14.25f, 3.56f, 14.5f, 2.97f, 14.97f)
                curveTo(2.2f, 15.58f, 1.75f, 16.51f, 1.75f, 17.5f)
                curveTo(1.75f, 18.09f, 1.91f, 18.67f, 2.22f, 19.17f)
                curveTo(2.8f, 20.15f, 3.87f, 20.75f, 5f, 20.75f)
                curveTo(5.79f, 20.75f, 6.55f, 20.46f, 7.13f, 19.94f)
                curveTo(7.39f, 19.72f, 7.61f, 19.46f, 7.77f, 19.18f)
                curveTo(8.09f, 18.67f, 8.25f, 18.09f, 8.25f, 17.5f)
                curveTo(8.25f, 15.71f, 6.79f, 14.25f, 5f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.429f, 19.24f)
                curveTo(4.239f, 19.24f, 4.049f, 19.17f, 3.899f, 19.02f)
                lineTo(2.909f, 18.03f)
                curveTo(2.619f, 17.74f, 2.619f, 17.26f, 2.909f, 16.97f)
                curveTo(3.199f, 16.68f, 3.679f, 16.68f, 3.969f, 16.97f)
                lineTo(4.449f, 17.45f)
                lineTo(6.049f, 15.97f)
                curveTo(6.349f, 15.69f, 6.829f, 15.71f, 7.109f, 16.01f)
                curveTo(7.389f, 16.31f, 7.369f, 16.79f, 7.069f, 17.07f)
                lineTo(4.939f, 19.04f)
                curveTo(4.789f, 19.17f, 4.609f, 19.24f, 4.429f, 19.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 11.25f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.25f, 7.75f, 10.91f, 7.75f, 10.5f)
                curveTo(7.75f, 10.09f, 8.09f, 9.75f, 8.5f, 9.75f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 9.75f, 16.25f, 10.09f, 16.25f, 10.5f)
                curveTo(16.25f, 10.91f, 15.91f, 11.25f, 15.5f, 11.25f)
                close()
            }
        }.build()

        return _MessageTick!!
    }

@Suppress("ObjectPropertyName")
private var _MessageTick: ImageVector? = null
