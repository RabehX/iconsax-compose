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

val Iconsax.Outline.Medal: ImageVector
    get() {
        if (_Medal != null) {
            return _Medal!!
        }
        _Medal = ImageVector.Builder(
            name = "Outline.Medal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                curveTo(7.86f, 15.75f, 4.5f, 12.5f, 4.5f, 8.5f)
                curveTo(4.5f, 4.5f, 7.86f, 1.25f, 12f, 1.25f)
                curveTo(16.14f, 1.25f, 19.5f, 4.5f, 19.5f, 8.5f)
                curveTo(19.5f, 12.5f, 16.14f, 15.75f, 12f, 15.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(8.69f, 2.75f, 6f, 5.33f, 6f, 8.5f)
                curveTo(6f, 11.67f, 8.69f, 14.25f, 12f, 14.25f)
                curveTo(15.31f, 14.25f, 18f, 11.67f, 18f, 8.5f)
                curveTo(18f, 5.33f, 15.31f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.62f, 22.75f)
                curveTo(15.34f, 22.75f, 15.06f, 22.68f, 14.77f, 22.55f)
                lineTo(12.08f, 21.28f)
                curveTo(12.05f, 21.27f, 11.94f, 21.27f, 11.9f, 21.28f)
                lineTo(9.23f, 22.54f)
                curveTo(8.64f, 22.82f, 8.02f, 22.81f, 7.54f, 22.5f)
                curveTo(7.04f, 22.18f, 6.75f, 21.59f, 6.76f, 20.89f)
                lineTo(6.77f, 13.51f)
                curveTo(6.77f, 13.1f, 7.09f, 12.74f, 7.52f, 12.76f)
                curveTo(7.93f, 12.76f, 8.27f, 13.1f, 8.27f, 13.51f)
                lineTo(8.26f, 20.89f)
                curveTo(8.26f, 21.11f, 8.32f, 21.22f, 8.35f, 21.23f)
                curveTo(8.37f, 21.24f, 8.46f, 21.25f, 8.6f, 21.18f)
                lineTo(11.28f, 19.91f)
                curveTo(11.71f, 19.71f, 12.3f, 19.71f, 12.73f, 19.91f)
                lineTo(15.42f, 21.18f)
                curveTo(15.56f, 21.25f, 15.65f, 21.24f, 15.67f, 21.23f)
                curveTo(15.7f, 21.21f, 15.76f, 21.1f, 15.76f, 20.89f)
                verticalLineTo(13.33f)
                curveTo(15.76f, 12.92f, 16.1f, 12.58f, 16.51f, 12.58f)
                curveTo(16.92f, 12.58f, 17.26f, 12.92f, 17.26f, 13.33f)
                verticalLineTo(20.89f)
                curveTo(17.26f, 21.6f, 16.97f, 22.18f, 16.47f, 22.5f)
                curveTo(16.21f, 22.67f, 15.92f, 22.75f, 15.62f, 22.75f)
                close()
            }
        }.build()

        return _Medal!!
    }

@Suppress("ObjectPropertyName")
private var _Medal: ImageVector? = null
