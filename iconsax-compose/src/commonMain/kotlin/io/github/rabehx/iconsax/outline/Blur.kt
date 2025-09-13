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

val Iconsax.Outline.Blur: ImageVector
    get() {
        if (_Blur != null) {
            return _Blur!!
        }
        _Blur = ImageVector.Builder(
            name = "Outline.Blur",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(7.12f, 22.75f, 3.151f, 18.78f, 3.151f, 13.9f)
                curveTo(3.121f, 8.17f, 8.58f, 3.4f, 10.931f, 1.61f)
                curveTo(11.561f, 1.13f, 12.441f, 1.13f, 13.071f, 1.61f)
                curveTo(15.42f, 3.43f, 20.881f, 8.26f, 20.851f, 13.91f)
                curveTo(20.851f, 18.78f, 16.881f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(11.95f, 2.75f, 11.891f, 2.77f, 11.84f, 2.81f)
                curveTo(10.151f, 4.1f, 4.63f, 8.71f, 4.66f, 13.9f)
                curveTo(4.66f, 17.96f, 7.96f, 21.25f, 12.01f, 21.25f)
                curveTo(16.06f, 21.25f, 19.361f, 17.96f, 19.361f, 13.91f)
                curveTo(19.39f, 8.79f, 13.861f, 4.12f, 12.16f, 2.81f)
                curveTo(12.101f, 2.77f, 12.05f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.71f)
                curveTo(11.72f, 19.71f, 11.45f, 19.55f, 11.32f, 19.29f)
                curveTo(11.14f, 18.92f, 11.29f, 18.47f, 11.67f, 18.29f)
                lineTo(19.37f, 14.55f)
                curveTo(19.74f, 14.37f, 20.19f, 14.53f, 20.37f, 14.9f)
                curveTo(20.55f, 15.27f, 20.4f, 15.72f, 20.02f, 15.9f)
                lineTo(12.32f, 19.64f)
                curveTo(12.22f, 19.68f, 12.11f, 19.71f, 12f, 19.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.71f)
                curveTo(11.72f, 14.71f, 11.45f, 14.55f, 11.32f, 14.29f)
                curveTo(11.14f, 13.92f, 11.29f, 13.47f, 11.67f, 13.29f)
                lineTo(19.04f, 9.71f)
                curveTo(19.41f, 9.53f, 19.86f, 9.68f, 20.04f, 10.06f)
                curveTo(20.22f, 10.44f, 20.07f, 10.88f, 19.69f, 11.06f)
                lineTo(12.32f, 14.64f)
                curveTo(12.22f, 14.68f, 12.11f, 14.71f, 12f, 14.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.71f)
                curveTo(11.72f, 9.71f, 11.45f, 9.55f, 11.32f, 9.29f)
                curveTo(11.14f, 8.92f, 11.29f, 8.47f, 11.67f, 8.29f)
                lineTo(16.7f, 5.85f)
                curveTo(17.07f, 5.67f, 17.52f, 5.83f, 17.7f, 6.2f)
                curveTo(17.88f, 6.57f, 17.73f, 7.02f, 17.35f, 7.2f)
                lineTo(12.32f, 9.64f)
                curveTo(12.22f, 9.68f, 12.11f, 9.71f, 12f, 9.71f)
                close()
            }
        }.build()

        return _Blur!!
    }

@Suppress("ObjectPropertyName")
private var _Blur: ImageVector? = null
