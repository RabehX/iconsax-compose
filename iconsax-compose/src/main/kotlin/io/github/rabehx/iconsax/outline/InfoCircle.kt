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

val Iconsax.Outline.InfoCircle: ImageVector
    get() {
        if (_InfoCircle != null) {
            return _InfoCircle!!
        }
        _InfoCircle = ImageVector.Builder(
            name = "Outline.InfoCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13f)
                verticalLineTo(8f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8f)
                verticalLineTo(13f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17f)
                curveTo(11.87f, 17f, 11.74f, 16.97f, 11.62f, 16.92f)
                curveTo(11.5f, 16.87f, 11.39f, 16.8f, 11.29f, 16.71f)
                curveTo(11.2f, 16.61f, 11.13f, 16.51f, 11.08f, 16.38f)
                curveTo(11.03f, 16.26f, 11f, 16.13f, 11f, 16f)
                curveTo(11f, 15.87f, 11.03f, 15.74f, 11.08f, 15.62f)
                curveTo(11.13f, 15.5f, 11.2f, 15.39f, 11.29f, 15.29f)
                curveTo(11.39f, 15.2f, 11.5f, 15.13f, 11.62f, 15.08f)
                curveTo(11.86f, 14.98f, 12.14f, 14.98f, 12.38f, 15.08f)
                curveTo(12.5f, 15.13f, 12.61f, 15.2f, 12.71f, 15.29f)
                curveTo(12.8f, 15.39f, 12.87f, 15.5f, 12.92f, 15.62f)
                curveTo(12.97f, 15.74f, 13f, 15.87f, 13f, 16f)
                curveTo(13f, 16.13f, 12.97f, 16.26f, 12.92f, 16.38f)
                curveTo(12.87f, 16.51f, 12.8f, 16.61f, 12.71f, 16.71f)
                curveTo(12.61f, 16.8f, 12.5f, 16.87f, 12.38f, 16.92f)
                curveTo(12.26f, 16.97f, 12.13f, 17f, 12f, 17f)
                close()
            }
        }.build()

        return _InfoCircle!!
    }

@Suppress("ObjectPropertyName")
private var _InfoCircle: ImageVector? = null
