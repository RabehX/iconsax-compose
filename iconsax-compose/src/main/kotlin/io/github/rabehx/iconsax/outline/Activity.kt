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

val Iconsax.Outline.Activity: ImageVector
    get() {
        if (_Activity != null) {
            return _Activity!!
        }
        _Activity = ImageVector.Builder(
            name = "Outline.Activity",
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
                moveTo(7.33f, 15.24f)
                curveTo(7.17f, 15.24f, 7.01f, 15.19f, 6.87f, 15.08f)
                curveTo(6.54f, 14.83f, 6.48f, 14.36f, 6.73f, 14.03f)
                lineTo(9.11f, 10.94f)
                curveTo(9.4f, 10.57f, 9.81f, 10.33f, 10.28f, 10.27f)
                curveTo(10.74f, 10.21f, 11.21f, 10.34f, 11.58f, 10.63f)
                lineTo(13.41f, 12.07f)
                curveTo(13.48f, 12.13f, 13.55f, 12.13f, 13.6f, 12.12f)
                curveTo(13.64f, 12.12f, 13.71f, 12.1f, 13.77f, 12.02f)
                lineTo(16.08f, 9.04f)
                curveTo(16.33f, 8.71f, 16.81f, 8.65f, 17.13f, 8.91f)
                curveTo(17.46f, 9.16f, 17.52f, 9.63f, 17.26f, 9.96f)
                lineTo(14.95f, 12.94f)
                curveTo(14.66f, 13.31f, 14.25f, 13.55f, 13.78f, 13.6f)
                curveTo(13.31f, 13.66f, 12.85f, 13.53f, 12.48f, 13.24f)
                lineTo(10.65f, 11.8f)
                curveTo(10.58f, 11.74f, 10.5f, 11.74f, 10.46f, 11.75f)
                curveTo(10.42f, 11.75f, 10.35f, 11.77f, 10.29f, 11.85f)
                lineTo(7.91f, 14.94f)
                curveTo(7.78f, 15.14f, 7.56f, 15.24f, 7.33f, 15.24f)
                close()
            }
        }.build()

        return _Activity!!
    }

@Suppress("ObjectPropertyName")
private var _Activity: ImageVector? = null
