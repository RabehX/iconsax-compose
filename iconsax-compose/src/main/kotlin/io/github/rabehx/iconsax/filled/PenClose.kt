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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.PenClose: ImageVector
    get() {
        if (_PenClose != null) {
            return _PenClose!!
        }
        _PenClose = ImageVector.Builder(
            name = "Filled.PenClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 21.29f)
                lineTo(6.64f, 22.39f)
                curveTo(5.99f, 22.47f, 5.41f, 22.37f, 4.92f, 22.13f)
                curveTo(4.4f, 21.87f, 3.99f, 21.47f, 3.73f, 20.94f)
                curveTo(3.49f, 20.45f, 3.4f, 19.88f, 3.47f, 19.24f)
                lineTo(4.32f, 12.09f)
                curveTo(4.4f, 12.12f, 4.48f, 12.15f, 4.56f, 12.17f)
                curveTo(5.17f, 12.39f, 5.82f, 12.5f, 6.5f, 12.5f)
                curveTo(7.96f, 12.5f, 9.37f, 11.97f, 10.44f, 11.02f)
                curveTo(10.9f, 10.62f, 11.31f, 10.14f, 11.64f, 9.59f)
                curveTo(11.92f, 9.12f, 12.13f, 8.62f, 12.27f, 8.13f)
                curveTo(12.34f, 7.87f, 12.4f, 7.59f, 12.44f, 7.31f)
                curveTo(12.45f, 7.26f, 12.45f, 7.21f, 12.45f, 7.16f)
                lineTo(12.62f, 7.17f)
                lineTo(18.7f, 13.26f)
                lineTo(18.96f, 17.68f)
                curveTo(19.21f, 20.16f, 18.35f, 21.02f, 16f, 21.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 2f)
                curveTo(5.44f, 2f, 4.46f, 2.37f, 3.69f, 2.99f)
                curveTo(2.65f, 3.81f, 2f, 5.08f, 2f, 6.5f)
                curveTo(2f, 7.34f, 2.24f, 8.14f, 2.65f, 8.82f)
                curveTo(3.09f, 9.55f, 3.73f, 10.15f, 4.51f, 10.53f)
                curveTo(4.68f, 10.62f, 4.87f, 10.7f, 5.06f, 10.76f)
                curveTo(5.51f, 10.92f, 5.99f, 11f, 6.5f, 11f)
                curveTo(7.64f, 11f, 8.67f, 10.58f, 9.46f, 9.88f)
                curveTo(9.81f, 9.58f, 10.11f, 9.22f, 10.35f, 8.82f)
                curveTo(10.56f, 8.47f, 10.72f, 8.1f, 10.83f, 7.7f)
                curveTo(10.89f, 7.5f, 10.93f, 7.29f, 10.96f, 7.07f)
                curveTo(10.99f, 6.88f, 11f, 6.69f, 11f, 6.5f)
                curveTo(11f, 4.01f, 8.99f, 2f, 6.5f, 2f)
                close()
                moveTo(8.23f, 8.21f)
                curveTo(8.09f, 8.35f, 7.89f, 8.43f, 7.7f, 8.43f)
                curveTo(7.51f, 8.43f, 7.32f, 8.35f, 7.17f, 8.21f)
                lineTo(6.51f, 7.55f)
                lineTo(5.83f, 8.23f)
                curveTo(5.68f, 8.38f, 5.49f, 8.45f, 5.3f, 8.45f)
                curveTo(5.11f, 8.45f, 4.91f, 8.38f, 4.77f, 8.23f)
                curveTo(4.48f, 7.94f, 4.48f, 7.46f, 4.77f, 7.17f)
                lineTo(5.46f, 6.48f)
                lineTo(4.79f, 5.83f)
                curveTo(4.5f, 5.54f, 4.5f, 5.06f, 4.79f, 4.77f)
                curveTo(5.08f, 4.48f, 5.56f, 4.48f, 5.85f, 4.77f)
                lineTo(6.51f, 5.43f)
                lineTo(7.14f, 4.8f)
                curveTo(7.43f, 4.51f, 7.91f, 4.51f, 8.2f, 4.8f)
                curveTo(8.49f, 5.09f, 8.49f, 5.57f, 8.2f, 5.86f)
                lineTo(7.57f, 6.49f)
                lineTo(8.23f, 7.15f)
                curveTo(8.53f, 7.44f, 8.53f, 7.91f, 8.23f, 8.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 10.282f)
                lineTo(19.931f, 11.592f)
                curveTo(19.541f, 11.832f, 19.041f, 11.782f, 18.721f, 11.452f)
                lineTo(14.291f, 7.022f)
                curveTo(13.971f, 6.702f, 13.911f, 6.202f, 14.151f, 5.812f)
                lineTo(15.461f, 3.742f)
                curveTo(16.261f, 2.482f, 17.861f, 2.422f, 19.051f, 3.592f)
                lineTo(22.161f, 6.702f)
                curveTo(23.251f, 7.812f, 23.181f, 9.532f, 22.001f, 10.282f)
                close()
            }
        }.build()

        return _PenClose!!
    }

@Suppress("ObjectPropertyName")
private var _PenClose: ImageVector? = null
