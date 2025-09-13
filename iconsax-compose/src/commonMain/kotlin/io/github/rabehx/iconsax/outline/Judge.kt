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

val Iconsax.Outline.Judge: ImageVector
    get() {
        if (_Judge != null) {
            return _Judge!!
        }
        _Judge = ImageVector.Builder(
            name = "Outline.Judge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.01f, 19.26f)
                curveTo(19.82f, 19.26f, 19.63f, 19.19f, 19.48f, 19.04f)
                lineTo(14.53f, 14.09f)
                curveTo(14.24f, 13.8f, 14.24f, 13.32f, 14.53f, 13.03f)
                curveTo(14.82f, 12.74f, 15.3f, 12.74f, 15.59f, 13.03f)
                lineTo(20.54f, 17.98f)
                curveTo(20.83f, 18.27f, 20.83f, 18.75f, 20.54f, 19.04f)
                curveTo(20.39f, 19.19f, 20.2f, 19.26f, 20.01f, 19.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.109f, 18.43f)
                curveTo(9.379f, 18.43f, 8.679f, 18.14f, 8.169f, 17.62f)
                lineTo(3.929f, 13.38f)
                curveTo(2.859f, 12.31f, 2.859f, 10.56f, 3.929f, 9.49f)
                lineTo(11f, 2.42f)
                curveTo(12.069f, 1.35f, 13.819f, 1.35f, 14.889f, 2.42f)
                lineTo(19.129f, 6.66f)
                curveTo(19.649f, 7.18f, 19.94f, 7.87f, 19.94f, 8.6f)
                curveTo(19.94f, 9.33f, 19.649f, 10.03f, 19.129f, 10.54f)
                lineTo(12.059f, 17.61f)
                curveTo(11.54f, 18.15f, 10.849f, 18.43f, 10.109f, 18.43f)
                close()
                moveTo(12.939f, 3.12f)
                curveTo(12.62f, 3.12f, 12.3f, 3.24f, 12.059f, 3.49f)
                lineTo(4.989f, 10.56f)
                curveTo(4.499f, 11.05f, 4.499f, 11.84f, 4.989f, 12.33f)
                lineTo(9.229f, 16.57f)
                curveTo(9.699f, 17.04f, 10.519f, 17.04f, 11f, 16.57f)
                lineTo(18.069f, 9.5f)
                curveTo(18.309f, 9.26f, 18.44f, 8.95f, 18.44f, 8.62f)
                curveTo(18.44f, 8.29f, 18.309f, 7.97f, 18.069f, 7.74f)
                lineTo(13.83f, 3.5f)
                curveTo(13.58f, 3.24f, 13.259f, 3.12f, 12.939f, 3.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 21.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.75f, 1.25f, 21.41f, 1.25f, 21f)
                curveTo(1.25f, 20.59f, 1.59f, 20.25f, 2f, 20.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 20.25f, 8.75f, 20.59f, 8.75f, 21f)
                curveTo(8.75f, 21.41f, 8.41f, 21.75f, 8f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.63f, 15.74f)
                curveTo(13.44f, 15.74f, 13.25f, 15.67f, 13.1f, 15.52f)
                lineTo(6.03f, 8.45f)
                curveTo(5.74f, 8.16f, 5.74f, 7.68f, 6.03f, 7.39f)
                curveTo(6.32f, 7.1f, 6.8f, 7.1f, 7.09f, 7.39f)
                lineTo(14.16f, 14.46f)
                curveTo(14.45f, 14.75f, 14.45f, 15.23f, 14.16f, 15.52f)
                curveTo(14.02f, 15.67f, 13.82f, 15.74f, 13.63f, 15.74f)
                close()
            }
        }.build()

        return _Judge!!
    }

@Suppress("ObjectPropertyName")
private var _Judge: ImageVector? = null
