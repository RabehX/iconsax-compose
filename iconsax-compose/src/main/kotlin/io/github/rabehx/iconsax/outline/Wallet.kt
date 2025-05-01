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

val Iconsax.Outline.Wallet: ImageVector
    get() {
        if (_Wallet != null) {
            return _Wallet!!
        }
        _Wallet = ImageVector.Builder(
            name = "Outline.Wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.2f, 10.46f)
                curveTo(5.01f, 10.46f, 4.81f, 10.38f, 4.67f, 10.24f)
                curveTo(4.46f, 10.02f, 4.39f, 9.7f, 4.51f, 9.42f)
                lineTo(6.37f, 4.98f)
                curveTo(6.41f, 4.89f, 6.43f, 4.83f, 6.46f, 4.78f)
                curveTo(7.94f, 1.37f, 9.83f, 0.54f, 13.17f, 1.82f)
                curveTo(13.36f, 1.89f, 13.51f, 2.04f, 13.59f, 2.23f)
                curveTo(13.67f, 2.42f, 13.67f, 2.63f, 13.59f, 2.82f)
                lineTo(10.66f, 9.62f)
                curveTo(10.54f, 9.9f, 10.27f, 10.07f, 9.97f, 10.07f)
                horizontalLineTo(7.12f)
                curveTo(6.55f, 10.07f, 6.01f, 10.18f, 5.49f, 10.4f)
                curveTo(5.4f, 10.44f, 5.3f, 10.46f, 5.2f, 10.46f)
                close()
                moveTo(10.61f, 2.75f)
                curveTo(9.37f, 2.75f, 8.61f, 3.56f, 7.82f, 5.4f)
                curveTo(7.81f, 5.43f, 7.79f, 5.46f, 7.78f, 5.49f)
                lineTo(6.47f, 8.6f)
                curveTo(6.69f, 8.58f, 6.9f, 8.57f, 7.12f, 8.57f)
                horizontalLineTo(9.47f)
                lineTo(11.88f, 2.97f)
                curveTo(11.41f, 2.82f, 10.99f, 2.75f, 10.61f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.29f, 10.27f)
                curveTo(18.22f, 10.27f, 18.14f, 10.26f, 18.07f, 10.24f)
                curveTo(17.69f, 10.13f, 17.29f, 10.07f, 16.87f, 10.07f)
                horizontalLineTo(9.97f)
                curveTo(9.72f, 10.07f, 9.48f, 9.94f, 9.34f, 9.73f)
                curveTo(9.21f, 9.52f, 9.18f, 9.25f, 9.28f, 9.02f)
                lineTo(12.18f, 2.29f)
                curveTo(12.33f, 1.93f, 12.77f, 1.68f, 13.14f, 1.81f)
                curveTo(13.26f, 1.85f, 13.37f, 1.9f, 13.49f, 1.95f)
                lineTo(15.85f, 2.94f)
                curveTo(17.23f, 3.51f, 18.15f, 4.11f, 18.75f, 4.83f)
                curveTo(18.87f, 4.97f, 18.97f, 5.12f, 19.07f, 5.28f)
                curveTo(19.18f, 5.45f, 19.28f, 5.65f, 19.35f, 5.86f)
                curveTo(19.38f, 5.93f, 19.43f, 6.06f, 19.46f, 6.2f)
                curveTo(19.74f, 7.15f, 19.6f, 8.31f, 19f, 9.81f)
                curveTo(18.87f, 10.09f, 18.59f, 10.27f, 18.29f, 10.27f)
                close()
                moveTo(11.11f, 8.57f)
                horizontalLineTo(16.88f)
                curveTo(17.2f, 8.57f, 17.51f, 8.6f, 17.82f, 8.65f)
                curveTo(18.1f, 7.78f, 18.16f, 7.11f, 18f, 6.57f)
                curveTo(17.98f, 6.48f, 17.96f, 6.44f, 17.95f, 6.4f)
                curveTo(17.89f, 6.24f, 17.85f, 6.15f, 17.8f, 6.07f)
                curveTo(17.73f, 5.96f, 17.68f, 5.87f, 17.6f, 5.78f)
                curveTo(17.17f, 5.26f, 16.41f, 4.78f, 15.27f, 4.31f)
                lineTo(13.3f, 3.49f)
                lineTo(11.11f, 8.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.9f, 22.75f)
                horizontalLineTo(8.1f)
                curveTo(7.82f, 22.75f, 7.56f, 22.73f, 7.3f, 22.7f)
                curveTo(3.79f, 22.47f, 1.79f, 20.46f, 1.55f, 16.91f)
                curveTo(1.52f, 16.69f, 1.5f, 16.42f, 1.5f, 16.15f)
                verticalLineTo(14.2f)
                curveTo(1.5f, 11.95f, 2.84f, 9.92f, 4.91f, 9.02f)
                curveTo(5.62f, 8.72f, 6.36f, 8.57f, 7.13f, 8.57f)
                horizontalLineTo(16.89f)
                curveTo(17.46f, 8.57f, 18.01f, 8.65f, 18.52f, 8.81f)
                curveTo(20.87f, 9.52f, 22.52f, 11.74f, 22.52f, 14.2f)
                verticalLineTo(16.15f)
                curveTo(22.52f, 16.37f, 22.51f, 16.58f, 22.5f, 16.78f)
                curveTo(22.28f, 20.69f, 20f, 22.75f, 15.9f, 22.75f)
                close()
                moveTo(7.12f, 10.07f)
                curveTo(6.55f, 10.07f, 6.01f, 10.18f, 5.49f, 10.4f)
                curveTo(3.97f, 11.06f, 2.99f, 12.55f, 2.99f, 14.2f)
                verticalLineTo(16.15f)
                curveTo(2.99f, 16.36f, 3.01f, 16.57f, 3.03f, 16.77f)
                curveTo(3.22f, 19.62f, 4.62f, 21.02f, 7.43f, 21.21f)
                curveTo(7.68f, 21.24f, 7.88f, 21.26f, 8.09f, 21.26f)
                horizontalLineTo(15.89f)
                curveTo(19.19f, 21.26f, 20.81f, 19.81f, 20.97f, 16.71f)
                curveTo(20.98f, 16.53f, 20.99f, 16.35f, 20.99f, 16.15f)
                verticalLineTo(14.2f)
                curveTo(20.99f, 12.39f, 19.78f, 10.77f, 18.06f, 10.24f)
                curveTo(17.68f, 10.13f, 17.28f, 10.07f, 16.86f, 10.07f)
                horizontalLineTo(7.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.24f, 14.95f)
                curveTo(1.83f, 14.95f, 1.49f, 14.61f, 1.49f, 14.2f)
                verticalLineTo(11.27f)
                curveTo(1.49f, 8.12f, 3.72f, 5.4f, 6.8f, 4.8f)
                curveTo(7.07f, 4.75f, 7.35f, 4.85f, 7.53f, 5.06f)
                curveTo(7.7f, 5.27f, 7.75f, 5.57f, 7.64f, 5.82f)
                lineTo(5.89f, 10f)
                curveTo(5.81f, 10.18f, 5.67f, 10.32f, 5.5f, 10.4f)
                curveTo(3.98f, 11.06f, 3f, 12.55f, 3f, 14.2f)
                curveTo(2.99f, 14.61f, 2.66f, 14.95f, 2.24f, 14.95f)
                close()
                moveTo(5.6f, 6.82f)
                curveTo(4.32f, 7.54f, 3.39f, 8.8f, 3.1f, 10.27f)
                curveTo(3.54f, 9.82f, 4.05f, 9.44f, 4.63f, 9.16f)
                lineTo(5.6f, 6.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.759f, 14.95f)
                curveTo(21.349f, 14.95f, 21.009f, 14.61f, 21.009f, 14.2f)
                curveTo(21.009f, 12.39f, 19.799f, 10.77f, 18.079f, 10.24f)
                curveTo(17.879f, 10.18f, 17.709f, 10.04f, 17.619f, 9.85f)
                curveTo(17.529f, 9.66f, 17.519f, 9.44f, 17.599f, 9.25f)
                curveTo(18.069f, 8.08f, 18.189f, 7.23f, 17.999f, 6.57f)
                curveTo(17.979f, 6.48f, 17.959f, 6.44f, 17.949f, 6.4f)
                curveTo(17.819f, 6.11f, 17.889f, 5.77f, 18.119f, 5.55f)
                curveTo(18.349f, 5.33f, 18.699f, 5.28f, 18.979f, 5.43f)
                curveTo(21.159f, 6.57f, 22.509f, 8.81f, 22.509f, 11.27f)
                verticalLineTo(14.2f)
                curveTo(22.509f, 14.61f, 22.169f, 14.95f, 21.759f, 14.95f)
                close()
                moveTo(19.249f, 9.09f)
                curveTo(19.879f, 9.38f, 20.439f, 9.79f, 20.909f, 10.28f)
                curveTo(20.719f, 9.3f, 20.249f, 8.41f, 19.559f, 7.71f)
                curveTo(19.509f, 8.13f, 19.409f, 8.59f, 19.249f, 9.09f)
                close()
            }
        }.build()

        return _Wallet!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet: ImageVector? = null
