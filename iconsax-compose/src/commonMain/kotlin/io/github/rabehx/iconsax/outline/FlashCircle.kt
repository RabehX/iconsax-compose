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

val Iconsax.Outline.FlashCircle: ImageVector
    get() {
        if (_FlashCircle != null) {
            return _FlashCircle!!
        }
        _FlashCircle = ImageVector.Builder(
            name = "Outline.FlashCircle",
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
                moveTo(9.71f, 17.84f)
                curveTo(9.42f, 17.84f, 9.2f, 17.74f, 9.07f, 17.64f)
                curveTo(8.8f, 17.46f, 8.39f, 17f, 8.65f, 15.97f)
                lineTo(9.42f, 12.86f)
                lineTo(8.5f, 12.63f)
                curveTo(7.57f, 12.4f, 7.36f, 11.81f, 7.32f, 11.57f)
                curveTo(7.28f, 11.33f, 7.26f, 10.7f, 8.04f, 10.15f)
                lineTo(13.22f, 6.56f)
                curveTo(14.09f, 5.96f, 14.66f, 6.18f, 14.93f, 6.36f)
                curveTo(15.2f, 6.54f, 15.61f, 7f, 15.35f, 8.03f)
                lineTo(14.58f, 11.14f)
                lineTo(15.5f, 11.37f)
                curveTo(16.43f, 11.6f, 16.64f, 12.19f, 16.68f, 12.44f)
                curveTo(16.72f, 12.69f, 16.74f, 13.31f, 15.96f, 13.86f)
                lineTo(10.78f, 17.45f)
                curveTo(10.35f, 17.74f, 10f, 17.84f, 9.71f, 17.84f)
                close()
                moveTo(9.11f, 11.24f)
                lineTo(10.51f, 11.59f)
                curveTo(10.91f, 11.69f, 11.16f, 12.1f, 11.06f, 12.5f)
                lineTo(10.18f, 16.04f)
                lineTo(14.89f, 12.77f)
                lineTo(13.49f, 12.42f)
                curveTo(13.09f, 12.32f, 12.84f, 11.91f, 12.94f, 11.51f)
                lineTo(13.82f, 7.97f)
                lineTo(9.11f, 11.24f)
                close()
            }
        }.build()

        return _FlashCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FlashCircle: ImageVector? = null
