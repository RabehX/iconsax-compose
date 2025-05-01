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

val Iconsax.Outline.TicketStar: ImageVector
    get() {
        if (_TicketStar != null) {
            return _TicketStar!!
        }
        _TicketStar = ImageVector.Builder(
            name = "Outline.TicketStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.001f, 20.75f)
                horizontalLineTo(7.001f)
                curveTo(2.751f, 20.75f, 1.361f, 19.48f, 1.261f, 15.52f)
                curveTo(1.261f, 15.32f, 1.331f, 15.12f, 1.471f, 14.98f)
                curveTo(1.611f, 14.84f, 1.801f, 14.75f, 2.011f, 14.75f)
                curveTo(3.521f, 14.75f, 4.751f, 13.51f, 4.751f, 12f)
                curveTo(4.751f, 10.49f, 3.521f, 9.25f, 2.011f, 9.25f)
                curveTo(1.811f, 9.25f, 1.621f, 9.17f, 1.471f, 9.02f)
                curveTo(1.321f, 8.87f, 1.251f, 8.68f, 1.261f, 8.48f)
                curveTo(1.361f, 4.52f, 2.751f, 3.25f, 7.001f, 3.25f)
                horizontalLineTo(17.001f)
                curveTo(21.411f, 3.25f, 22.751f, 4.59f, 22.751f, 9f)
                verticalLineTo(15f)
                curveTo(22.751f, 19.41f, 21.411f, 20.75f, 17.001f, 20.75f)
                close()
                moveTo(2.791f, 16.18f)
                curveTo(2.961f, 18.72f, 3.821f, 19.25f, 7.001f, 19.25f)
                horizontalLineTo(17.001f)
                curveTo(20.581f, 19.25f, 21.251f, 18.57f, 21.251f, 15f)
                verticalLineTo(9f)
                curveTo(21.251f, 5.43f, 20.581f, 4.75f, 17.001f, 4.75f)
                horizontalLineTo(7.001f)
                curveTo(3.821f, 4.75f, 2.961f, 5.29f, 2.791f, 7.82f)
                curveTo(4.761f, 8.2f, 6.251f, 9.93f, 6.251f, 12f)
                curveTo(6.251f, 14.07f, 4.761f, 15.8f, 2.791f, 16.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 8.25f)
                curveTo(8.59f, 8.25f, 8.25f, 7.91f, 8.25f, 7.5f)
                verticalLineTo(4f)
                curveTo(8.25f, 3.59f, 8.59f, 3.25f, 9f, 3.25f)
                curveTo(9.41f, 3.25f, 9.75f, 3.59f, 9.75f, 4f)
                verticalLineTo(7.5f)
                curveTo(9.75f, 7.91f, 9.41f, 8.25f, 9f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 20.75f)
                curveTo(8.59f, 20.75f, 8.25f, 20.41f, 8.25f, 20f)
                verticalLineTo(16.5f)
                curveTo(8.25f, 16.09f, 8.59f, 15.75f, 9f, 15.75f)
                curveTo(9.41f, 15.75f, 9.75f, 16.09f, 9.75f, 16.5f)
                verticalLineTo(20f)
                curveTo(9.75f, 20.41f, 9.41f, 20.75f, 9f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.04f, 15.65f)
                curveTo(12.8f, 15.65f, 12.56f, 15.57f, 12.36f, 15.43f)
                curveTo(12f, 15.17f, 11.82f, 14.73f, 11.9f, 14.29f)
                lineTo(12.11f, 13.1f)
                lineTo(11.24f, 12.25f)
                curveTo(10.92f, 11.94f, 10.81f, 11.48f, 10.94f, 11.06f)
                curveTo(11.08f, 10.64f, 11.44f, 10.33f, 11.88f, 10.27f)
                lineTo(13.08f, 10.09f)
                lineTo(13.62f, 9f)
                curveTo(13.82f, 8.6f, 14.22f, 8.35f, 14.66f, 8.35f)
                curveTo(15.11f, 8.35f, 15.51f, 8.6f, 15.7f, 9f)
                lineTo(16.24f, 10.09f)
                lineTo(17.44f, 10.27f)
                curveTo(17.88f, 10.33f, 18.24f, 10.64f, 18.38f, 11.06f)
                curveTo(18.52f, 11.48f, 18.4f, 11.94f, 18.08f, 12.25f)
                lineTo(17.21f, 13.1f)
                lineTo(17.42f, 14.29f)
                curveTo(17.5f, 14.73f, 17.32f, 15.17f, 16.96f, 15.43f)
                curveTo(16.6f, 15.69f, 16.13f, 15.72f, 15.74f, 15.52f)
                lineTo(14.67f, 14.96f)
                lineTo(13.59f, 15.52f)
                curveTo(13.42f, 15.61f, 13.23f, 15.65f, 13.04f, 15.65f)
                close()
                moveTo(12.77f, 11.65f)
                lineTo(13.28f, 12.15f)
                curveTo(13.56f, 12.42f, 13.68f, 12.8f, 13.62f, 13.18f)
                lineTo(13.5f, 13.88f)
                lineTo(14.13f, 13.55f)
                curveTo(14.47f, 13.37f, 14.87f, 13.37f, 15.21f, 13.55f)
                lineTo(15.84f, 13.88f)
                lineTo(15.72f, 13.18f)
                curveTo(15.66f, 12.79f, 15.78f, 12.41f, 16.06f, 12.15f)
                lineTo(16.57f, 11.65f)
                lineTo(15.87f, 11.55f)
                curveTo(15.49f, 11.49f, 15.16f, 11.25f, 14.99f, 10.91f)
                lineTo(14.68f, 10.27f)
                lineTo(14.37f, 10.91f)
                curveTo(14.2f, 11.25f, 13.87f, 11.49f, 13.49f, 11.55f)
                lineTo(12.77f, 11.65f)
                close()
            }
        }.build()

        return _TicketStar!!
    }

@Suppress("ObjectPropertyName")
private var _TicketStar: ImageVector? = null
