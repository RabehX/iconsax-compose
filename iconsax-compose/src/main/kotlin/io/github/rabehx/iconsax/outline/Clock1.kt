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

val Iconsax.Outline.Clock1: ImageVector
    get() {
        if (_Clock1 != null) {
            return _Clock1!!
        }
        _Clock1 = ImageVector.Builder(
            name = "Outline.Clock1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.4f, 14.6f)
                curveTo(13.21f, 14.6f, 13.02f, 14.53f, 12.87f, 14.38f)
                lineTo(11.47f, 12.98f)
                curveTo(11.33f, 12.84f, 11.25f, 12.65f, 11.25f, 12.45f)
                verticalLineTo(9.66f)
                curveTo(11.25f, 9.25f, 11.59f, 8.91f, 12f, 8.91f)
                curveTo(12.41f, 8.91f, 12.75f, 9.25f, 12.75f, 9.66f)
                verticalLineTo(12.14f)
                lineTo(13.93f, 13.32f)
                curveTo(14.22f, 13.61f, 14.22f, 14.09f, 13.93f, 14.38f)
                curveTo(13.78f, 14.53f, 13.59f, 14.6f, 13.4f, 14.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.25f)
                curveTo(10.41f, 19.25f, 8.91f, 18.75f, 7.65f, 17.8f)
                curveTo(7.62f, 17.78f, 7.6f, 17.77f, 7.57f, 17.75f)
                curveTo(5.78f, 16.36f, 4.75f, 14.26f, 4.75f, 12f)
                curveTo(4.75f, 8f, 8f, 4.75f, 12f, 4.75f)
                curveTo(16f, 4.75f, 19.25f, 8f, 19.25f, 12f)
                curveTo(19.25f, 14.25f, 18.23f, 16.33f, 16.46f, 17.72f)
                curveTo(16.43f, 17.74f, 16.41f, 17.76f, 16.38f, 17.78f)
                curveTo(15.11f, 18.74f, 13.6f, 19.25f, 12f, 19.25f)
                close()
                moveTo(8.43f, 16.51f)
                curveTo(8.46f, 16.53f, 8.48f, 16.54f, 8.5f, 16.56f)
                curveTo(10.53f, 18.13f, 13.51f, 18.12f, 15.53f, 16.54f)
                curveTo(15.55f, 16.52f, 15.58f, 16.5f, 15.6f, 16.49f)
                curveTo(16.97f, 15.39f, 17.75f, 13.76f, 17.75f, 12f)
                curveTo(17.75f, 8.83f, 15.17f, 6.25f, 12f, 6.25f)
                curveTo(8.83f, 6.25f, 6.25f, 8.83f, 6.25f, 12f)
                curveTo(6.25f, 13.77f, 7.04f, 15.41f, 8.43f, 16.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.55f, 22.75f)
                horizontalLineTo(11.46f)
                curveTo(9.5f, 22.75f, 8.3f, 21.78f, 7.79f, 19.77f)
                lineTo(7.29f, 17.3f)
                curveTo(7.25f, 17.08f, 7.3f, 16.85f, 7.45f, 16.68f)
                curveTo(7.6f, 16.51f, 7.81f, 16.41f, 8.03f, 16.41f)
                horizontalLineTo(8.04f)
                curveTo(8.21f, 16.41f, 8.37f, 16.46f, 8.5f, 16.57f)
                curveTo(10.53f, 18.14f, 13.51f, 18.13f, 15.53f, 16.55f)
                curveTo(15.84f, 16.31f, 16.33f, 16.36f, 16.58f, 16.67f)
                curveTo(16.72f, 16.84f, 16.78f, 17.07f, 16.74f, 17.29f)
                lineTo(16.23f, 19.76f)
                curveTo(15.7f, 21.78f, 14.5f, 22.75f, 12.55f, 22.75f)
                close()
                moveTo(9.09f, 18.64f)
                lineTo(9.25f, 19.44f)
                curveTo(9.63f, 20.94f, 10.41f, 21.25f, 11.46f, 21.25f)
                horizontalLineTo(12.55f)
                curveTo(13.59f, 21.25f, 14.37f, 20.94f, 14.76f, 19.42f)
                lineTo(14.92f, 18.64f)
                curveTo(13.11f, 19.44f, 10.91f, 19.45f, 9.09f, 18.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 7.62f)
                curveTo(15.83f, 7.62f, 15.66f, 7.56f, 15.53f, 7.46f)
                curveTo(13.51f, 5.88f, 10.53f, 5.87f, 8.5f, 7.44f)
                curveTo(8.19f, 7.68f, 7.7f, 7.63f, 7.46f, 7.33f)
                curveTo(7.32f, 7.16f, 7.26f, 6.93f, 7.3f, 6.71f)
                lineTo(7.79f, 4.27f)
                curveTo(8.3f, 2.22f, 9.5f, 1.25f, 11.46f, 1.25f)
                horizontalLineTo(12.55f)
                curveTo(14.5f, 1.25f, 15.7f, 2.22f, 16.21f, 4.21f)
                lineTo(16.73f, 6.72f)
                curveTo(16.78f, 6.94f, 16.72f, 7.17f, 16.58f, 7.34f)
                curveTo(16.44f, 7.52f, 16.23f, 7.62f, 16f, 7.62f)
                close()
                moveTo(12f, 4.75f)
                curveTo(13.03f, 4.75f, 14.01f, 4.96f, 14.92f, 5.36f)
                lineTo(14.75f, 4.55f)
                curveTo(14.36f, 3.07f, 13.59f, 2.75f, 12.55f, 2.75f)
                horizontalLineTo(11.46f)
                curveTo(10.41f, 2.75f, 9.63f, 3.06f, 9.25f, 4.6f)
                lineTo(9.09f, 5.36f)
                curveTo(10f, 4.96f, 10.98f, 4.75f, 12f, 4.75f)
                close()
            }
        }.build()

        return _Clock1!!
    }

@Suppress("ObjectPropertyName")
private var _Clock1: ImageVector? = null
